import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockExample {
    private final Lock lock = new ReentrantLock();
    private int count = 0;

    public void increment() {
        lock.lock();   // acquire lock
        try {
            count++;
        } finally {
            lock.unlock(); // always release
        }
    }
}