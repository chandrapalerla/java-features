import java.util.Optional;

/*
The orElseThrow method is used to either return the value if it is present,
or throw an exception if it is not. This method is particularly useful when you want to enforce
the presence of a value and handle the absence explicitly.
 */
public class OrElseThrow {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(getValue());
        String value = optional.orElseThrow(() -> new IllegalArgumentException("Value must be present"));
        System.out.println(value);

    }

    private static String getValue() {
        // This could return a value or null
        return "Hello, World!";
    }
}
