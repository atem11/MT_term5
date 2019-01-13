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

    public String code() {
        return code;
    }
}
