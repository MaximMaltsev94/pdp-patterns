package shapes;

public class Rhombus extends Square {
    private Double alpha;

    public Rhombus(Double size, Double alpha) {
        super(size);
        this.alpha = alpha;
    }

    @Override
    public double square() {
        return side1 * side2 * Math.sin(Math.toRadians(alpha));
    }
}
