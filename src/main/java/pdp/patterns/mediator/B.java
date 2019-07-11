package pdp.patterns.mediator;

public class B {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void react() {
        System.out.println("B: someone ping me!!");
    }

    public void performAction() {
        mediator.pingA();
    }
}
