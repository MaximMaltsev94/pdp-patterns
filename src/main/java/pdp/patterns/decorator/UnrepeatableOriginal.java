package pdp.patterns.decorator;

public class UnrepeatableOriginal implements CommonInterface  {
    @Override
    public void doAction() {
        System.out.println("brilliat action by original");
    }
}
