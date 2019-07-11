package pdp.patterns.mediator;

public class A {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void react() {
        System.out.println("A: someone ping me!!");
    }

    public void performAction() {
        mediator.pingB();
    }

}
