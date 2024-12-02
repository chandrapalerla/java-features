public class RecordPatternPreview {
    public static void main(String[] args) {
        Object obj = new Point(3, 4);

        if (obj instanceof Point(int x, int y)) {
            System.out.println("x = " + x + ", y = " + y);
        } else {
            System.out.println("Not a Point");
        }
    }
}
