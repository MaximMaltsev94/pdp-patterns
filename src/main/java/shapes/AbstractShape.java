package shapes;

public abstract class AbstractShape implements Shape {
    @Override
    public boolean isSquareEquals(Shape other) {
        return this.square() == other.square();
    }
}
