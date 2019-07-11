package pdp.patterns.decorator;

import pdp.patterns.composite.Composite;

public class PitifulParody implements CommonInterface {
    private CommonInterface targetInstance;

    //принципиальный момент что декоратор нельзя создать без внутреннего обьекта
    public PitifulParody(CommonInterface targetInstance) {
        this.targetInstance = targetInstance;
    }

    @Override
    public void doAction() {
        System.out.print("pitifulParody wrapping: ");
        targetInstance.doAction();
    }
}
