package org.vitualtthread;

public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from a virtual thread!");
        });

        // Wait for the virtual thread to complete
        vThread.join();
    }
}
