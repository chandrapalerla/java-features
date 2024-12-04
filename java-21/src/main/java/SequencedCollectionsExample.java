import java.util.List;
import java.util.ArrayList;

public class SequencedCollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("one", "two", "three"));
        
        list.addFirst("zero");
        list.addLast("four");
        
        System.out.println("First element: " + list.getFirst()); // Output: zero
        System.out.println("Last element: " + list.getLast()); // Output: four
        
        list.removeFirst();
        list.removeLast();
        
        System.out.println("Modified list: " + list); // Output: [one, two, three]
        
        List<String> reversedList = list.reversed();
        System.out.println("Reversed list: " + reversedList); // Output: [three, two, one]
    }
}
