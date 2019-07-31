package t10_3;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class T10_3Main {
    public static void main(String[] args) {
        //заполняем лист как в 1 и 2 заданнии

        List<Integer> marksList = Arrays.asList(8, 9, 9, 10, 2, 5, 4, 4);

        //решение 1 через listIterator
        ListIterator<Integer> integerListIterator = marksList.listIterator(marksList.size());
        while (integerListIterator.hasPrevious()) {
            System.out.print(integerListIterator.previous() + " ");
        }

        System.out.println();

        //решение 2 через счетчик

        for(int i = marksList.size() - 1; i >= 0; --i) {
            System.out.print(marksList.get(i) + " ");
        }

    }
}
