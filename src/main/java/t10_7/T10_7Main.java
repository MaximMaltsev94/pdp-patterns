package t10_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T10_7Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 11, -12, 13, -14, 15, -16, 17, -18);

        list.sort(Comparator.reverseOrder());

        System.out.println(list);

    }
}
