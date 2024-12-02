import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadsFirstPreview {
    public static void main(String[] args) {
        var executor = Executors.newVirtualThreadPerTaskExecutor();
        IntStream.range(0, 1000).forEach(i -> {
            executor.submit(() -> {
                System.out.println("Task " + i + " executed by " + Thread.currentThread());
            });
        });
        executor.shutdown();
    }
}
