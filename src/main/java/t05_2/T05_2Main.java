package t05_2;

public class T05_2Main {
    public static void main(String[] args) {
        ArifmeticOperations<Integer> integerArifmeticOperations = new ArifmeticOperations<>(10);
        ArifmeticOperations<Double> doubleArifmeticOperations = new ArifmeticOperations<>(30.0);

        System.out.println(integerArifmeticOperations.plus(5));
        System.out.println(integerArifmeticOperations.minus(5));
        System.out.println(integerArifmeticOperations.multiply(5));
        System.out.println(integerArifmeticOperations.divide(5));

        System.out.println(doubleArifmeticOperations.plus(5.0));
        System.out.println(doubleArifmeticOperations.minus(5.0));
        System.out.println(doubleArifmeticOperations.multiply(5.0));
        System.out.println(doubleArifmeticOperations.divide(5.0));
    }
}
