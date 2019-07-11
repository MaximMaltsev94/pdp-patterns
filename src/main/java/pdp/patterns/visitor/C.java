package pdp.patterns.visitor;

public class C {
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
