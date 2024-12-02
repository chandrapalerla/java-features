public class PatternMatchingForSwitchSecondReview {
    public static void main(String[] args) {
        Object obj = "Hello";

        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            default -> System.out.println("Unknown type");
        }
    }
}
