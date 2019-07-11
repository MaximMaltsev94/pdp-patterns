package pdp.patterns.visitor;

public class VisitorImpl02 implements Visitor {
    public void visit(A a) {
        System.out.println("VisitorImpl02 visitA()");
    }

    public void visit(B b) {
        System.out.println("VisitorImpl02 visitB()");
    }

    public void visit(C c) {
        System.out.println("VisitorImpl02 visitC()");
    }
}
