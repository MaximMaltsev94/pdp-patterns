package shapes;

public class Rectangle extends AbstractShape {
    protected Double side1;
    protected Double side2;

    public Rectangle(Double side1, Double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double perimeter() {
        return 2.0 * (side1 + side2);
    }

    @Override
    public double square() {
        return side1 * side2;
    }
}
