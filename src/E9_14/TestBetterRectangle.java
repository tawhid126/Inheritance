package E10_14;
public class TestBetterRectangle {
    public static void main(String[] args) {
        BetterRectangle rect = new BetterRectangle(0, 0, 5, 10);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
