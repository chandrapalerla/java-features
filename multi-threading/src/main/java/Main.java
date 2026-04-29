class ReentrantDemo {
    synchronized void outer() {
        System.out.println("Outer method");
        inner(); // same thread re-enters lock
    }

    synchronized void inner() {
        System.out.println("Inner method");
    }
}

public class Main {
    static void main() {
        ReentrantDemo obj = new ReentrantDemo();
        new Thread(obj::outer).start();
    }
}