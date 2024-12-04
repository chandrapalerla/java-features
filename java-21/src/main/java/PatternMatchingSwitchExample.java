public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        Object obj = "Hello, Java!";

        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case null -> System.out.println("Null value");
            default -> System.out.println("Unknown type");
        }
    }
}
