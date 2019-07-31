package t11_4;

public class BlackBoxMain {
    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox();
        blackBox.put(20, 10, 1, 15, 40, 2230, 123, 6, 323);

        System.out.println("set : " + blackBox.toString());

        System.out.println("Min 3 = " + blackBox.getMinK(3));
        System.out.println("Max 3 = " + blackBox.getMaxN(3));

    }
}
