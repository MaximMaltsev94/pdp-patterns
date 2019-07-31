package t10_5;

public class T10_5Main {
    public static void main(String[] args) {
        Set set1 = new Set();
        Set set2 = new Set();

        set1.put(10);
        set1.put(20);
        set1.put(30);
        set1.put(40);
        set1.put(50);

        set2.put(30);
        set2.put(40);
        set2.put(50);
        set2.put(60);
        set2.put(70);

        System.out.println("Set1 = " + set1.toString());
        System.out.println("Set2 = " + set2.toString());
        System.out.println("Union = " + set1.union(set2));
        System.out.println("Intersect = " + set1.intersect(set2));

    }
}
