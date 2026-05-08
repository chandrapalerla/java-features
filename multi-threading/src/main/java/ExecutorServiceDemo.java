void main(){
    ExecutorService service =
            Executors.newFixedThreadPool(2);

    service.execute(() ->
            System.out.println("Task 1"));

    service.execute(() ->
            System.out.println("Task 2"));

    service.shutdown();
}
