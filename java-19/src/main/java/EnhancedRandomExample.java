import java.util.random.*;

public class EnhancedRandomExample {
    public static void main(String[] args) {
        RandomGeneratorFactory<RandomGenerator> factory = RandomGeneratorFactory.of("L128X256MixRandom");
        RandomGenerator randomGenerator = factory.create();

        for (int i = 0; i < 10; i++) {
            System.out.println(randomGenerator.nextInt());
        }
    }
}
