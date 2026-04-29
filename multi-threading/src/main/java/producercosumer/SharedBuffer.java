package producercosumer;

class SharedBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {//Guarded Block
            wait();  // wait if buffer full
        }

        data = value;
        System.out.println("Produced: " + value);
        hasData = true;

        notify();  // notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!hasData) {//Guarded Block
            wait();  // wait if buffer empty
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify();  // notify producer
    }
}