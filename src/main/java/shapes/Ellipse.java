package shapes;

import static java.lang.Math.*;

public class Ellipse extends AbstractShape {
    protected Double majorAxis;
    protected Double minorAxis;

    public Ellipse(Double majorAxis, Double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double perimeter() {
        return 2.0 * PI * sqrt((pow(majorAxis, 2.0) + pow(minorAxis, 2.0)) / 8.0);
    }

    @Override
    public double square() {
        return PI * majorAxis * minorAxis / 4.0;
    }
}
