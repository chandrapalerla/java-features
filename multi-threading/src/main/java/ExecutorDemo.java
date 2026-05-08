import java.util.concurrent.Executor;

void main() {

    Executor executor = command -> new Thread(command).start();

    executor.execute(() -> {
        System.out.println("Task executed by thread: " + Thread.currentThread().getName());
    });
}
