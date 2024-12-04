public class NestedRecordPatterns {
    public static void main(String[] args) {
        record Point(int x, int y) {}
        record Line(Point start, Point end) {}

        Line line = new Line(new Point(1, 2), new Point(3, 4));

        if (line instanceof Line(Point(int startX, int startY), Point(int endX, int endY))) {
            System.out.println("Start: (" + startX + ", " + startY + ")");
            System.out.println("End: (" + endX + ", " + endY + ")");
        }
    }
}
