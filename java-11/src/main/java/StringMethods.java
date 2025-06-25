public class StringMethods {
    public static void main(String[] args) {
        //lines()
        String multiline = "line1\nline2\nline3";
        multiline.lines().forEach(System.out::println);

        String str = "   Hello World!    ";
        //strip : Remove the all spaces
        System.out.println(str.strip()); // "Hello World!"
        //stripLeading: Remove the spaces left side
        System.out.println(str.stripLeading()); // "Hello World!   "
        //stripTrailing: Remove the spaces right side
        System.out.println(str.stripTrailing()); // "   Hello World!"
        //repeat: Repeat the word particular time
        System.out.println("Hello".repeat(3)); // "HelloHelloHello"
        //isBlank: check string is empty or not
        System.out.println("   ".isBlank()); // true
    }
}
