void main() throws Exception {
    Callable<Integer> cal = () -> {
        System.out.println("Task running in: " + Thread.currentThread().getName());
        Thread.sleep(2000);
        return 42;
    };

    ExecutorService executorService = Executors.newFixedThreadPool(3);
    Future<Integer> future = executorService.submit(cal);
    Integer value = future.get();
    System.out.println(value);
    executorService.shutdown();
}
