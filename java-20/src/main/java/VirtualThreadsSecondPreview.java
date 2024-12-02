import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class VirtualThreadsSecondPreview {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println("Running in virtual thread: " + Thread.currentThread());
                });
            }
        }
    }
}
