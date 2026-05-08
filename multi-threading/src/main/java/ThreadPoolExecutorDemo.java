void main() {
    ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10,
            TimeUnit.SECONDS, new LinkedBlockingQueue<>());
    for (int i = 1; i <= 5; i++) {
        int task = i;

        executor.execute(() ->
                System.out.println(
                        "Task " + task +
                                " by " +
                                Thread.currentThread().getName()
                )
        );
        executor.shutdown();
    }
}