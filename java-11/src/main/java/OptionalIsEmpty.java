import java.util.Optional;

public class OptionalIsEmpty {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("chandu");
        System.out.println(name.isEmpty());

        Optional<String> name1 = Optional.empty();
        System.out.println(name1.isEmpty());
    }
}
