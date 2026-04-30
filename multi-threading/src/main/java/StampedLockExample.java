import java.util.concurrent.locks.StampedLock;

class StampedLockExample {
    private final StampedLock lock = new StampedLock();
    private int value = 0;

    static void main() {
        StampedLockExample stampedLockExample = new StampedLockExample();
        stampedLockExample.write(50);
        stampedLockExample.read();
    }

    public void write(int newValue) {
        long stamp = lock.writeLock();
        try {
            value = newValue;
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    public int read() {
        long stamp = lock.tryOptimisticRead();
        int temp = value;

        if (!lock.validate(stamp)) { // fallback
            stamp = lock.readLock();
            try {
                temp = value;
            } finally {
                lock.unlockRead(stamp);
            }
        }
        return temp;
    }
}