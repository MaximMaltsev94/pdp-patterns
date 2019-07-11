package pdp.patterns.visitor;

public class B {
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
