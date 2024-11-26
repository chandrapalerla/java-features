import java.util.List;

public class VarForLambda {
    public static void main(String[] args) {

        var names = List.of("mickel", "morries", "brook");
        names.forEach(System.out::println);
        //var for lambda
        names.forEach((var name) -> System.out.println(name));
    }
}
