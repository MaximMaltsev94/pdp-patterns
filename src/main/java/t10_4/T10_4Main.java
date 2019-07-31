package t10_4;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class T10_4Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = console.nextLine();

        Stack stack = new Stack(3);

        for (char digit : number.toCharArray()) {
            stack.put(Character.getNumericValue(digit));
        }

        while(true) {
            try {
                System.out.print(stack.get() + " ");
            } catch (NoSuchElementException e) {
                break;
            }
        }
        System.out.println();
    }
}
