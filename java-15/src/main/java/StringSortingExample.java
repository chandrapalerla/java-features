import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSortingExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "pear", "banana", "kiwi", "grape", "orange");

        // Sorting the list of strings based on length, and if lengths are equal, by the first character
        List<String> sortedStrings = strings.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(str -> str.charAt(0))).toList();

        // Printing the sorted list
        sortedStrings.forEach(System.out::println);
    }
}
