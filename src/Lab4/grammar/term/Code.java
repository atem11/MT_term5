package Lab4.grammar.term;

public class Code implements ObjTerm {

    private final String code;

    public Code(String code) {
        this.code = code;
    }

    @Override
    public String name() {
        return "~code~";
    }

    @Override
    public String toString() {
        return "code";
    }

    public String code() {
        return code;
    }
}
