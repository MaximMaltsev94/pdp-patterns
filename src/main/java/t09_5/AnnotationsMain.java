package t09_5;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.ListIterator;

public class AnnotationsMain {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        ListIterator<Integer> listIterator = list.listIterator();

        listIterator.add(10);
        listIterator.add(20);
        listIterator.add(30);

        System.out.println(list);
    }
}
