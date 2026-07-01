package org.vitualtthread;

import java.util.concurrent.Executors;

public class VirtualThreadsExecutorExample {
    static void main(String[] args) throws InterruptedException {
        try (var executor = Executors.newThreadPerTaskExecutor(Thread.ofVirtual().factory())) {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println("Task executed by virtual thread: " + Thread.currentThread());
                });
            }
        }
    }
}
