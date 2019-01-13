package Lab4.grammar.term;

public class Term implements ObjTerm {

    private final String name;
    private final String regexp;

    public Term (String name) {
        this.name = name;
        this.regexp = "\"\"";
    }

    public Term(String name, String regexp) {
        this.name = name;
        this.regexp = regexp;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String regexp() {
        return regexp;
    }
}
