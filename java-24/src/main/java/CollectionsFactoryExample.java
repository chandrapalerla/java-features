import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionsFactoryExample {
    public static void main(String[] args) {
        // Factory method returning an immutable empty list
        List<String> emptyList = Collections.emptyList();
        System.out.println("Empty List: " + emptyList);
        try {
            emptyList.add("item");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify empty list: " + e.getMessage());
        }

        // Factory method returning an immutable list with a single element
        List<String> singletonList = Collections.singletonList("Hello");
        System.out.println("Singleton List: " + singletonList);
        try {
            singletonList.add("World");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify singleton list: " + e.getMessage());
        }

        // Factory method returning an unmodifiable view of another list
        List<String> mutableList = new java.util.ArrayList<>();
        mutableList.add("Apple");
        mutableList.add("Banana");
        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("Unmodifiable List: " + unmodifiableList);
        mutableList.add("Cherry"); // This affects the unmodifiable view!
        System.out.println("Unmodifiable List after mutable change: " + unmodifiableList);
        try {
            unmodifiableList.remove("Apple");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable list directly: " + e.getMessage());
        }

        Set<Integer> emptySet = Collections.emptySet();
        System.out.println("Empty Set: " + emptySet);
    }
}