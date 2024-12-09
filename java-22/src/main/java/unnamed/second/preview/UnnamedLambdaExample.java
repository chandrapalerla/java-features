package unnamed.second.preview;

import java.util.List;

public class UnnamedLambdaExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Traditional way
        names.forEach(name -> System.out.println("Name: " + name));

        // Using unnamed variable in lambda
        names.forEach(_ -> System.out.println("Hello"));
    }
}
