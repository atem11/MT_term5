package Lab4.grammar;

import Lab4.grammar.rules.Rule;
import Lab4.grammar.term.Argument;
import Lab4.grammar.term.NonTerm;
import Lab4.grammar.term.ObjTerm;
import Lab4.grammar.term.Term;

import java.util.*;
import java.util.stream.Collectors;

public class Grammar {

    private List<NonTerm> nonTerms = new ArrayList<>();
    private List<Term> terms = new ArrayList<>();
    private String name;
    private String whiteSpaces = null;
    private String imports = null;

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

    public void addImports(String imports) {
        this.imports = imports;
    }

    public boolean hasImports() {
        return imports != null;
    }

    public List<Argument> getRetArg(ObjTerm term) {
        NonTerm t = (NonTerm) term;
        for (NonTerm tt : nonTerms) {
            if (tt.name().equals(t.name())) {
                return tt.getRet_args();
            }
        }
        return null;
    }

    public String imports() {
        return imports.substring(1, imports.length() - 1);
    }

    public void prepare() {
        searchFirst();
        searchFollow();
    }

    public Set<String> getFirst(NonTerm term) {
        return first.get(term.name());
    }

    public Set<String> getFollow(NonTerm term) {
        return follow.get(term.name());
    }

    //Generator part
    private Map<String, Set<String>> first = new HashMap<>();
    private Map<String, Set<String>> follow = new HashMap<>();
    private final String EPS = "__Eps__";

    public Set<String> findFirst(List<ObjTerm> seq) {
        Set<String> ans = new HashSet<>();
        if (seq.size() >= 1 && seq.get(0) instanceof Term) {
            ans.add(seq.get(0).name());
        } else {
            boolean prevEps = true;
            for (ObjTerm nextT : seq) {
                if (prevEps) {
                    if (nextT instanceof NonTerm) {
                        Set<String> nextFirst = first.get(nextT.name());
                        if (nextFirst.contains(EPS)) {
                            nextFirst.remove(EPS);
                            ans.addAll(nextFirst);
                            nextFirst.add(EPS);
                        } else {
                            ans.addAll(nextFirst);
                            prevEps = false;
                        }
                    } else {
                        prevEps = false;
                    }
                } else {
                    break;
                }
            }
            if (prevEps) {
                ans.add(EPS);
            }
        }
        return ans;
    }

    private void searchFirst() {
        for (NonTerm nt : nonTerms) {
            first.put(nt.name(), new HashSet<>());
        }

        while (true) {
            boolean notChange = true;
            for (NonTerm nt : nonTerms) {
                Set<String> prevSet = new HashSet<>(first.get(nt.name()));
                Set<String> tmpSet = first.get(nt.name());

                if (nt.isEps()) {
                    tmpSet.add(EPS);
                }

                for (Rule r : nt.rules()) {
                    List<ObjTerm> clearRule = r.rule()
                            .filter(t -> t instanceof NonTerm || t instanceof Term)
                            .collect(Collectors.toList());
                    tmpSet.addAll(findFirst(clearRule));
                }

                if (!prevSet.containsAll(tmpSet)) {
                    notChange = false;
                }
            }

            if (notChange) {
                break;
            }
        }

    }

    private void searchFollow() {
        for (NonTerm nt : nonTerms) {
            follow.put(nt.name(), new HashSet<>());
        }

        follow.get(nonTerms.get(0).name()).add("END_POINT");

        while (true) {
            Map<String, Set<String>> prevFollow = new HashMap<>();
            follow.forEach((name, set) -> prevFollow.put(name, new HashSet<>(set)));
            for (NonTerm nt : nonTerms) {

                for (Rule r : nt.rules()) {
                    List<ObjTerm> clearRule = r.rule()
                            .filter(t -> t instanceof NonTerm || t instanceof Term)
                            .collect(Collectors.toList());
                    if (clearRule.size() == 0) {
                        continue;
                    }
                    for (int i = 0; i < clearRule.size() - 1; i++) {
                        if (clearRule.get(i) instanceof NonTerm) {
                            NonTerm t = (NonTerm) clearRule.get(i);
                            Set<String> first = findFirst(clearRule.subList(i + 1, clearRule.size()));
                            if (first.contains(EPS)) {
                                first.remove(EPS);
                                follow.get(t.name()).addAll(first);
                                follow.get(t.name()).addAll(follow.get(nt.name()));
                            } else {
                                follow.get(t.name()).addAll(first);
                            }
                        }
                    }

                    if (clearRule.get(clearRule.size() - 1) instanceof NonTerm) {
                        NonTerm lastT = (NonTerm) clearRule.get(clearRule.size() - 1);
                        follow.get(lastT.name()).addAll(follow.get(nt.name()));
                    }
                }
            }

            final boolean[] br = {true};
            prevFollow.forEach((name, set) -> {
                if (!set.containsAll(follow.get(name))) {
                    br[0] = false;
                }
            });
            if (br[0]) {
                break;
            }
        }
    }
}
