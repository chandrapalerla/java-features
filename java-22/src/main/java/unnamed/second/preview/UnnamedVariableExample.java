package unnamed.second.preview;

import java.util.List;

public class UnnamedVariableExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Traditional way
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index: " + i + ", Name: " + names.get(i));
        }

//        // Using unnamed variable
//        for (int _ = 0; _ < names.size(); _++) {
//            System.out.println("Name: " + names.get(_));
//        }
    }
}
