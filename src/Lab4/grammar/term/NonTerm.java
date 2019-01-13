package Lab4.grammar.term;

import Lab4.grammar.rules.Rule;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonTerm implements ObjTerm {

    private final String name;
    private List<Rule> rules = new ArrayList<>();
    private List<Argument> args;
    private List<Argument> ret_args;
    private List<String> parameters = new ArrayList<>();
    private Boolean canBeEps = false;

    private Set<Term> first = new HashSet<>();
    private Set<Term> follow = new HashSet<>();

    public NonTerm(String name) {
        this.name = name;
    }

    public void addParameter(String s) {
        parameters.add(s);
    }

    public void addArgs(List<Argument> ar) {
        args = ar;
    }

    public void addRetArgs(List<Argument> ar) {
        ret_args = ar;
    }

    @Override
    public String name() {
        return name;
    }

    public void addRule(Rule rule) {
        if (rule == null) {
            canBeEps = true;
            return;
        }
        rules.add(rule);
    }
}
