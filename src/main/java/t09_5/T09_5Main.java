package t09_5;

import java.util.ArrayList;
import java.util.ListIterator;

public class T09_5Main {
    public static void main(String[] args) {
//        new TransactionalAnalyser().analyze(MyClass.class, new MyClass());

        ArrayList<Integer> list = new ArrayList<>();

        ListIterator<Integer> listIterator = list.listIterator();

        listIterator.add(10);
        listIterator.add(20);
        listIterator.add(30);

        System.out.println(list);
    }
}
