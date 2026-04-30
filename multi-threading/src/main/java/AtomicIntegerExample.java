void main() {
    AtomicInteger counter = new AtomicInteger(0);

    Runnable task = () -> {
        for (int i = 0; i < 1000; i++) {
            counter.incrementAndGet(); // atomic increment
        }
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();

    try {
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
    }

    IO.println("Final Count: " + counter.get());
}