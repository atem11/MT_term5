package Lab4.grammar.generator;

import Lab4.grammar.Grammar;
import Lab4.grammar.rules.Rule;
import Lab4.grammar.term.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ParserGenerator extends ClassGenerator {

    public ParserGenerator(String dir, Grammar grammar) throws IOException {
        super(dir, "Parser" + grammar.name() + ".java", grammar);
    }

    @Override
    void printImport() {
        if (grammar.hasImports()) {
            printCodeLine(0, grammar.imports(), EOL);
        }
    }

    @Override
    void printClass() {
        printName();
        printMembers();
        printRETvalues();
        printConstructor();
        printConsumer();
        for (NonTerm term : grammar.nonTerms()) {
            printStartParse(term);
        }

        printCodeLine(0, "}");
    }

    private void printRETvalues() {
        for (NonTerm term : grammar.nonTerms()) {
            if (term.getRet_args() != null) {
                printCodeLine(1, "public class", "RET" + term.name(), "{");
                for (Argument arg : term.getRet_args()) {
                    printCodeLine(2, "public", arg.getType(), arg.getName(), ";");
                }
                printCodeLine(1, "}", EOL);
            }
        }
    }

    private void printName() {
        printCodeLine(0, "public class Parser" + grammar.name(), "{", EOL);
    }

    private void printMembers() {
        printCodeLine(1, "private", "Lexer" + grammar.name(), "lexer;", EOL);
    }

    private void printConstructor() {
        printCodeLine(1, "public", "Parser" + grammar.name(), "(", "Lexer" + grammar.name(), "lexer) {");
        printCodeLine(2, "this.lexer = lexer;");
        printCodeLine(2, "this.lexer.nextToken();");
        printCodeLine(1, "}", EOL);
    }

    private void printConsumer() {
        printCodeLine(1, "private String consume(", "Token" + grammar.name(), "token) {");
        printCodeLine(2, "while (lexer.curToken() != token) {");
        printCodeLine(3, "System.err.println(\"Unexpected token:\" + token.name());");
        printCodeLine(3, "lexer.nextToken();");
        printCodeLine(2, "}");
        printCodeLine(2, "String res = lexer.curStr();");
        printCodeLine(2, "lexer.nextToken();");
        printCodeLine(2, "return res;");
        printCodeLine(1, "}", EOL);
    }

    private void printStartParse(NonTerm term) {
        StringBuilder args = new StringBuilder();
        args.append("(");
        if (term.getArgs() != null) {
            for (Argument a : term.getArgs()) {
                args.append(a.getType())
                        .append(" ")
                        .append(a.getName())
                        .append(",");
            }
            args.deleteCharAt(args.length() - 1);
        }
        args.append(")");
        if (term.getRet_args() != null) {
            printCodeLine(1, "public", "RET" + term.name(), term.name(), args.toString(), "{");
        } else {
            printCodeLine(1, "public", "void", term.name(), args.toString(), "{");
        }
        if (term.getRet_args() != null) {
            printCodeLine(2, "RET" + term.name(), "retArg = new", "RET" + term.name(), "();");
        }

        printCodeLine(2, "switch (lexer.curToken()) {");
        printFirstParse(term);
        if (term.isEps()) {
            printFollowParse(term);
        }
        printEndParse(term);
    }

    private void printFirstParse(NonTerm term) {
        for (Rule rule : term.rules()) {
            List<ObjTerm> clearRule = rule.rule()
                    .filter(t -> t instanceof NonTerm || t instanceof Term)
                    .collect(Collectors.toList());
            if (clearRule.size() == 0) {
                continue;
            }
            for (String tok : grammar.findFirst(clearRule)) {
                if (!tok.equals("__Eps__")) {
                    printCodeLine(3, "case", tok + ":");
                }
            }

            printCodeLine(3, "{");
            Set<String> localVars = new HashSet<>();
            rule.rule().forEach(objTerm -> {
                if (objTerm instanceof Code) {
                    printCodeLine(4, ((Code) objTerm).code().replaceAll("\\$", "retArg."));
                } else if (objTerm instanceof Term) {
                    String name = objTerm.name();
                    if (!localVars.contains(name)) {
                        printCodeLine(4, "String");
                        localVars.add(name);
                    }
                    printCodeLine(4, name, "= consume(lexer.curToken());");
                } else {
                    String name = objTerm.name();
                    if (grammar.getRetArg(objTerm) != null) {
                        if (!localVars.contains(name)) {
                            printCodeLine(4, "RET" + name);
                            localVars.add(name);
                        }
                        printCodeLine(4, name, "=");
                    }
                    printCodeLine(4, name);
                    StringBuilder args = new StringBuilder();
                    args.append("(");
                    if (((NonTerm) objTerm).getParameters() != null) {
                        for (String a : ((NonTerm) objTerm).getParameters()) {
                            args.append(a).append(",");
                        }
                        args.deleteCharAt(args.length() - 1);
                    }
                    args.append(");");
                    printCodeLine(5, args.toString());
                }
            });
            if (term.getRet_args() != null) {
                printCodeLine(4, "return retArg;");
            } else {
                printCodeLine(4, "break;");
            }
            printCodeLine(3, "}");
        }
    }

    private void printFollowParse(NonTerm term) {
        for (String tok : grammar.getFollow(term)) {
            if (!tok.equals("__Eps__")) {
                printCodeLine(3, "case", tok + ":");
            }
        }
        Rule rule = null;
        for (Rule r : term.rules()) {
            List<ObjTerm> rul = r.rule().collect(Collectors.toList());
            if (rul.size() == 0 || (rul.size() == 1 && rul.get(0) instanceof Code)) {
                rule = r;
            }
        }
        boolean retF = false;
        if (rule != null) {
            rule.rule().forEach(t -> {
                if (t instanceof Code) {
                    printCodeLine(4, ((Code) t).code().replaceAll("\\$", "retArg."));
                }
            });
            if (term.getRet_args() != null) {
                retF = true;
                printCodeLine(4, "return retArg;");
            }
        }
        if (!retF) {
            printCodeLine(4, "break;");
        }

    }

    private void printEndParse(NonTerm term) {
        printCodeLine(3, "default :");
        printCodeLine(4, "System.err.println(\"Unexpected Token:\" + lexer.curToken() );");
        printCodeLine(2, "}");
        if (term.getRet_args() != null) {
            printCodeLine(2 , "return null;");
        }
        printCodeLine(1, "}", EOL);
    }
}
