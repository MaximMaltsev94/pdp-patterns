package pdp.patterns.visitor;

public class VisitorImpl01 implements Visitor {
    public void visit(A a) {
        System.out.println("VisitorImpl01 visitA()");
    }

    public void visit(B b) {
        System.out.println("VisitorImpl01 visitB()");
    }

    public void visit(C c) {
        System.out.println("VisitorImpl01 visitC()");
    }
}
