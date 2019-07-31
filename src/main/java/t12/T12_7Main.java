package t12;

import java.util.Random;

public class T12_7Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        try {
            throwRandomException();
            System.out.println("after success execution throwRandomException() method");
        } catch (RuntimeException e) {
            System.out.println("inside catch block");
            throw e;
        } finally {
            System.out.println("inside finally block");
        }
    }

    public static void throwRandomException() {
        int i = RANDOM.nextInt(50);
        if(i > 25) {
            throw new RuntimeException();
        }
    }
}
