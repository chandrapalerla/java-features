package customthreadpool;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ParlellStreamWithCustomThreadPool {
    static void main() throws ExecutionException, InterruptedException {
        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().toList();
       // numbers.parallelStream().forEach(System.out::println);
        //System.out.println(ForkJoinPool.commonPool().getParallelism());
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        List<Integer> integers = forkJoinPool.submit(() -> numbers.parallelStream()
                .filter(n -> n % 2 == 0).toList()).get();
        forkJoinPool.shutdown();
        System.out.println(integers);
    }
}
