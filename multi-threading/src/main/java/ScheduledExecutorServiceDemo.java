void main() {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

//    scheduler.schedule(() -> System.out.println("Executed after delay"), 3, TimeUnit.SECONDS);
//    scheduler.shutdown();

    scheduler.scheduleAtFixedRate(() -> System.out.println("Running every 2 sec"), 1, 2, TimeUnit.SECONDS);

}
