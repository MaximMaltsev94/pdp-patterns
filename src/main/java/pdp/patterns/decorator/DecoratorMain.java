package pdp.patterns.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        CommonInterface commonInterface = new PatheticParody(new PitifulParody(new UnrepeatableOriginal()));
        commonInterface.doAction();

        commonInterface = new PatheticParody(new UnrepeatableOriginal());
        commonInterface.doAction();
    }
}
