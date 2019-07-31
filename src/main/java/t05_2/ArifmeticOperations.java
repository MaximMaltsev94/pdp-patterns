package t05_2;

public class ArifmeticOperations<T extends Number>  {
    private T value;

    public ArifmeticOperations(T value) {
        this.value = value;
    }

    public int plus(int value) {
        return this.value.intValue() + value;
    }

    public double plus(double value) {
        return this.value.doubleValue() + value;
    }

    public int minus(int value) {
        return this.value.intValue() - value;
    }

    public double minus(double value) {
        return this.value.doubleValue() - value;
    }

    public int multiply(int value) {
        return this.value.intValue() * value;
    }

    public double multiply(double value) {
        return this.value.doubleValue() * value;
    }

    public int divide(int value) {
        return this.value.intValue() / value;
    }

    public double divide(double value) {
        return this.value.doubleValue() / value;
    }

}
