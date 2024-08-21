import com.compleatable.FibonacciSeries;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinPool;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciSeriesTest {
    @Test
    public void testFibonacciTask() {
        assertEquals(1134903170L, new ForkJoinPool().invoke(new FibonacciSeries(45)).longValue());
    }
}
