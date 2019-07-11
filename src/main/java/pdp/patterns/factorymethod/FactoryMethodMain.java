package pdp.patterns.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        AbstractAlgorithm algorithm = new ConcreteAlgorithm1();
        algorithm.doAction();

        System.out.println("-----");

        algorithm = new ConcreteAlgorithm2();
        algorithm.doAction();
    }
}
