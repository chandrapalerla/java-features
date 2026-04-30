void main() {

    Runnable task = () -> {
        while (true) {
            IO.println(Thread.currentThread().getName());
        }
    };

    Thread high = new Thread(task);
    Thread low = new Thread(task);

    high.setPriority(Thread.MAX_PRIORITY);
    low.setPriority(Thread.MIN_PRIORITY);

    high.start();
    low.start();
}