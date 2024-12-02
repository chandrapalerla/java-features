public class PatternMatchingForSwitchThirdReview {
    public static void main(String[] args) {
        Object obj = "Hello";

       var result =  switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };
       System.out.println(result);
    }
}
