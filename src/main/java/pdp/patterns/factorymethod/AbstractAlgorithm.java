package pdp.patterns.factorymethod;

public interface AbstractAlgorithm {
    default void doAction() {
        System.out.println("abstract Step one");
        stepTwo();
        System.out.println("abstract Step three");
    }

    void stepTwo();
}
