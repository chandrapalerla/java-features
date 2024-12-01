import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorExample {

  public static void main(String[] args) {
    RandomGenerator randomGenerator  = RandomGeneratorFactory.of("L64X128MixRandom").create();
    System.out.println(randomGenerator.nextInt(1000));
  }
}
