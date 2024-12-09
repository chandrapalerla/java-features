import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("pavel", "mikalai", "donald", "onac", "ragav", "maset", "ahncy");
//sort according to length, if lenght is same consider first character


        List<String> collect = names.stream().sorted(Comparator.comparing(String::length).thenComparing(s -> s.charAt(0))).collect(Collectors.toList());
        System.out.println(collect);

    }
}
