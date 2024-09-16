package E10_15;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
}
