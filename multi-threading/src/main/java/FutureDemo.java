void main() throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    Future<Integer> future = executorService.submit(() -> {
        Thread.sleep(3000);
        return 42;
    });
    Integer value = future.get();
    IO.println(value);
    executorService.shutdown();

}
