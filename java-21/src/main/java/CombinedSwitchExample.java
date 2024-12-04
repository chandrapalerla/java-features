public class CombinedSwitchExample {
    sealed interface Shape permits Circle, Rectangle, Triangle {}

    record Circle(double radius) implements Shape {}
    record Rectangle(double length, double width) implements Shape {}
    record Triangle(double base, double height) implements Shape {}

    public static void main(String[] args) {
        Shape shape = new Rectangle(4, 6);

        String result = switch (shape) {
            case Circle c -> "Circle with radius " + c.radius();
           // case Rectangle r && r.length() == r.width() -> "Square with side " + r.length();
            case Rectangle r -> "Rectangle with length " + r.length() + " and width " + r.width();
            case Triangle t -> "Triangle with base " + t.base() + " and height " + t.height();
        };

        System.out.println(result);  // Output: Rectangle with length 4.0 and width 6.0
    }
}
