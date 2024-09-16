package E10_17;
import java.awt.Point;

public class LabeledPoint {
    private Point point;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.point = new Point(x, y);
        this.label = label;
    }

    @Override
    public String toString() {
        return point.toString() + ", label=" + label;
    }
}
