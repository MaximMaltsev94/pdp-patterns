package pdp.patterns.visitor;

public class A {
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
