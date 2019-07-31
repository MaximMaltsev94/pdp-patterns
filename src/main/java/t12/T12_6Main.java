package t12;

import java.util.Random;

public class T12_6Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        try {
            throwRandomException();
            System.out.println("after throwRandomException() method");
        } catch (NumberFormatException e) {
            System.out.println("deal with it \uD83D\uDE0E");
        }
    }

    public static void throwRandomException() {
        int i = RANDOM.nextInt(3);
        switch (i) {
            case 0:
                throw new RuntimeException("runtime exception 1");
//                break; // принципиальный момент - оператор break не нужен, т.к. в месте исключения выполнение метода остановится
            case 1:
                throw new IllegalArgumentException("don't like number 1. Number 1 is forbidden");
            case 2:
                throw new NumberFormatException("number 2 is looser");
        }
    }
}
