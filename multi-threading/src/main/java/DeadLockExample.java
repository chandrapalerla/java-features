private static final Object lock1 = new Object();
private static final Object lock2 = new Object();

void main() {
    Thread t1 = new Thread(() -> {
        synchronized (lock1) {
            System.out.println("Thread1 acquired lock1");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            synchronized (lock2) {
                System.out.println("Thread1 acquired lock2");
            }
        }
    });

    Thread t2 = new Thread(() -> {
        synchronized (lock2) {
            System.out.println("Thread2 acquired lock2");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            synchronized (lock1) {
                System.out.println("Thread2 acquired lock1");
            }
        }
    });

    t1.start();
    t2.start();
}
