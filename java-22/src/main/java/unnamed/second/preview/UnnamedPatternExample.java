package unnamed.second.preview;

public class UnnamedPatternExample {
    public static void main(String[] args) {
        Object obj = new Point(3, 4);

        // Traditional way
        if (obj instanceof Point p) {
            System.out.println("Point: " + p);
        }

        // Using unnamed pattern
        if (obj instanceof Point(_, _)) {
            System.out.println("It's a Point");
        }
    }
}

record Point(int x, int y) {}
