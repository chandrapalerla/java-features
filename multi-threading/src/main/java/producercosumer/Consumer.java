package producercosumer;

class Consumer extends Thread {
    private final SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}