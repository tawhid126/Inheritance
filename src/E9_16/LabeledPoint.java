package E10_16;
public class LabeledPoint {
    private int x;
    private int y;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    @Override
    public String toString() {
        return "LabeledPoint[x=" + x + ", y=" + y + ", label=" + label + "]";
    }
}
