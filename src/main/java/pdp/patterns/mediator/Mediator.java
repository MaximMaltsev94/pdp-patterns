package pdp.patterns.mediator;

public class Mediator {
    private A a;
    private B b;

    public Mediator(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void pingB() {
        b.react();
    }

    public void pingA() {
        a.react();
    }
}
