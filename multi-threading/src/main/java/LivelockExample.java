static class Worker {
    private boolean active = true;

    public synchronized void work(Worker other) {
        while (active) {
            if (other.active) {
                IO.println("Giving way to other worker");
                continue; // keeps yielding
            }
            IO.println("Working...");
            active = false;
        }
    }
}

void main() {
    Worker w1 = new Worker();
    Worker w2 = new Worker();

    new Thread(() -> w1.work(w2)).start();
    new Thread(() -> w2.work(w1)).start();
}