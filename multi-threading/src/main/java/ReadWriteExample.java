import java.util.concurrent.locks.*;

class ReadWriteExample {
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private int value = 0;

    static void main() {
        ReadWriteExample readWriteExample = new ReadWriteExample();
        readWriteExample.write(10);
        readWriteExample.read();
    }

    public void read() {
        rwLock.readLock().lock();
        try {
            System.out.println("Read: " + value);
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public void write(int newValue) {
        rwLock.writeLock().lock();
        try {
            value = newValue;
            System.out.println("Written: " + value);
        } finally {
            rwLock.writeLock().unlock();
        }
    }
}