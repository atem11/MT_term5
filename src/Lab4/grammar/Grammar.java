package Lab4.grammar;

import Lab4.grammar.term.NonTerm;
import Lab4.grammar.term.Term;

import java.util.ArrayList;
import java.util.List;

public class Grammar {

    private List<NonTerm> nonTerms = new ArrayList<>();
    private List<Term> terms = new ArrayList<>();
    private String name;
    private String whiteSpaces = null;

    public Grammar(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void addWS(String ws) {
        whiteSpaces = ws;
    }

    public void addNonTerm(NonTerm term) {
        nonTerms.add(term);
    }

    public void addTerm(Term term) {
        terms.add(term);
    }

    public String WS() {
        return whiteSpaces;
    }

    public List<Term> terms() {
        return terms;
    }

    public List<NonTerm> nonTerms() {
        return nonTerms;
    }
}
