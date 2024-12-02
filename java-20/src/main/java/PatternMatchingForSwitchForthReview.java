public class PatternMatchingForSwitchForthReview {
    public static void main(String[] args) {
        Object obj = "Hello";

        var result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "it's a null";
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}
