package shapes;

public class RightTriangle extends Triangle {
    public RightTriangle(Double cathetus1, Double cathetus2, Double hypotenuse) {
        super(hypotenuse, cathetus1, cathetus2, cathetus1);
    }
}
