import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantExample {
    private final ReentrantLock lock = new ReentrantLock(true);//Non - fair (default)

    public void outer() throws InterruptedException {
        lock.lock();
        try {
            inner();
        } finally {
            lock.unlock();
        }

        //try lock
        if (lock.tryLock()) {
            try {
                System.out.println("Got lock");
            } finally {
                lock.unlock();
            }

        } else {
            System.out.println("Could not acquire lock");
        }

        //try- lock with time out
        if (lock.tryLock(2, TimeUnit.SECONDS)) {
            try {
                System.out.println("Acquired within timeout");
            } finally {
                lock.unlock();
            }
        }

        //Lock Interruptibly
        try {
            lock.lockInterruptibly();
            try {
                System.out.println("Working...");
            } finally {
                lock.unlock();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting for lock");
        }
    }

    public void inner() {
        lock.lock(); // same thread can acquire again
        try {
            System.out.println("Inside inner");
        } finally {
            lock.unlock();
        }
    }
}