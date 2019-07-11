package pdp.patterns.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Mediator mediator = new Mediator(a, b);
        a.setMediator(mediator);
        b.setMediator(mediator);

        a.performAction();
        b.performAction();
    }
}
