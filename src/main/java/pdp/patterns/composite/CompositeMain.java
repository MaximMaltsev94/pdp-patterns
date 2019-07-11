package pdp.patterns.composite;

public class CompositeMain {
    public static void main(String[] args) {
        //2*2 + 3*4 + 4*4 = 32
        Composite composite = new Node(
                new Leaf(2),
                new Node(new Leaf(3),
                         new Node(new Leaf(4),
                                  new Leaf(4)),
                         new Leaf(3)),
                new Leaf(2),
                new Node(new Leaf(3),
                         new Node(new Leaf(4),
                                  new Leaf(4)),
                         new Leaf(3))
        );

        System.out.println(composite.calculate());
    }
}
