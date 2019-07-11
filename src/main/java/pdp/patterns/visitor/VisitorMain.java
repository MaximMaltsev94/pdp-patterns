package pdp.patterns.visitor;

public class VisitorMain {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl01();
        A a = new A();
        B b = new B();
        C c = new C();

        a.visit(visitor);
        b.visit(visitor);
        c.visit(visitor);
    }
}
