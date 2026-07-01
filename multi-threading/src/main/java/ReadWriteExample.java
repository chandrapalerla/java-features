import java.util.concurrent.locks.*;

class ReadWriteExample {
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private int value = 0;

    static void main() {
        ReadWriteExample readWriteExample = new ReadWriteExample();
        readWriteExample.write(10);
        readWriteExample.read(20);
    }

    public void read(int newValue) {
        rwLock.readLock().lock();
        try {
            value = newValue;
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