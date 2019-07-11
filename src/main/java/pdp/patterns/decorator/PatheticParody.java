package pdp.patterns.decorator;

public class PatheticParody implements CommonInterface {

    private CommonInterface targetInstance;

    //принципиальный момент что декоратор нельзя создать без внутреннего обьекта
    public PatheticParody(CommonInterface targetInstance) {
        this.targetInstance = targetInstance;
    }

    @Override
    public void doAction() {
        System.out.print("PatheticParody wrapping: ");
        targetInstance.doAction();
    }
}
