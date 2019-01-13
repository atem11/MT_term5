package Lab4.grammar.rules;

import Lab4.grammar.term.ObjTerm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Rule {

    private List<ObjTerm> rule = new ArrayList<>();

    public Rule() {
    }

    public void addTerm(ObjTerm term) {
        rule.add(term);
    }

    public Stream<ObjTerm> rule() {
        return rule.stream();
    }
}
