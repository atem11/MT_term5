package Lab4.grammar.term;

import Lab4.grammar.rules.Rule;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NonTerm implements ObjTerm {

    private final String name;
    private List<Rule> rules = new ArrayList<>();
    private List<Argument> args;
    private List<Argument> ret_args;
    private List<String> parameters = null;
    private Boolean canBeEps = false;


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

    @Override
    public String toString() {
        return name;
    }

    public void addRule(Rule rule) {
        List<ObjTerm> r = rule.rule().collect(Collectors.toList());
        if (r.size() == 1 && r.get(0) instanceof Code) {
            canBeEps = true;
        }
        if (r.size() == 0) {
            canBeEps = true;
        }
        rules.add(rule);
    }

    public boolean isEps() {
        return canBeEps;
    }

    public List<Rule> rules() {
        return rules;
    }

    public List<Argument> getRet_args() {
        return ret_args;
    }

    public List<Argument> getArgs() {
        return args;
    }

    public List<String> getParameters() {
        return parameters;
    }
}
