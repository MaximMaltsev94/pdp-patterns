package pdp.patterns.composite;

public class Leaf implements Composite {
    private long value;

    public Leaf(long value) {
        this.value = value;
    }

    public long calculate() {
        return value;
    }
}
