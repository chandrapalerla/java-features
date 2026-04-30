class LockOrderingExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method() {
        synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("Safe execution");
            }
        }
    }
}