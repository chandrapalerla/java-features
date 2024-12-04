public class ShapeExample {
    sealed interface Shape permits Circle, Rectangle {}

    record Circle(double radius) implements Shape {}
    record Rectangle(double length, double width) implements Shape {}

    public static void main(String[] args) {
        Shape shape = new Circle(5);

        String result = switch (shape) {
            case Circle(double radius) -> "Circle with radius " + radius;
            case Rectangle(double length, double width) -> "Rectangle with length " + length + " and width " + width;
        };

        System.out.println(result);  // Output: Circle with radius 5.0
    }
}
