package shapes;

public class Triangle extends AbstractShape {
    protected Double side1;
    protected Double side2;
    protected Double base;
    protected Double height;

    public Triangle(Double side1, Double side2, Double base, Double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + base;
    }

    @Override
    public double square() {
        return 0.5 * base * height;
    }
}
