import java.util.concurrent.locks.*;

class ConditionExample {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean ready = false;

    public void await() throws InterruptedException {
        lock.lock();
        try {
            while (!ready) {
                condition.await(); // wait
            }
            System.out.println("Proceeding...");
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        lock.lock();
        try {
            ready = true;
            condition.signal(); // notify one thread
        } finally {
            lock.unlock();
        }
    }
}