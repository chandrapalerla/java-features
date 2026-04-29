package producercosumer;

public class Main {
    static void main() {
        SharedBuffer buffer = new SharedBuffer();

        new Producer(buffer).start();
        new Consumer(buffer).start();
    }
}