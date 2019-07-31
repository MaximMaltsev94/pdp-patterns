package shapes;

public class ShapeUtils {
    public static boolean isRectangle(Shape shape) {
        if(shape instanceof Rectangle) {
            return true;
        }
        return false;
    }
}
