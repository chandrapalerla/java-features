package com.compleatable;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class SemaphoreProducerConsumer {

    private static final int BUFFER_SIZE = 10;  // Size of the buffer
    private static final Semaphore availableSlots = new Semaphore(BUFFER_SIZE);
    private static final Semaphore availableItems = new Semaphore(0);
    private static final Queue<Integer> buffer = new LinkedList<>();
    
    public static void main(String[] args) {
        Thread producer1 = new Thread(new Producer());
        Thread producer2 = new Thread(new Producer());
        Thread consumer1 = new Thread(new Consumer());
        Thread consumer2 = new Thread(new Consumer());

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }

    static class Producer implements Runnable {
        private static int counter = 0;

        @Override
        public void run() {
            try {
                while (true) {
                    int item = produceItem();
                    availableSlots.acquire(); // Acquire a slot from the buffer
                    synchronized (buffer) {
                        buffer.add(item);
                        System.out.println("Produced: " + item);
                    }
                    availableItems.release(); // Release an item to be consumed
                    Thread.sleep(1000); // Simulate time taken to produce
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupt status
            }
        }

        private int produceItem() {
            return counter++;
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    availableItems.acquire(); // Acquire an item from the buffer
                    int item;
                    synchronized (buffer) {
                        item = buffer.poll();
                        System.out.println("Consumed: " + item);
                    }
                    availableSlots.release(); // Release a slot in the buffer
                    consumeItem(item);
                    Thread.sleep(1500); // Simulate time taken to consume
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupt status
            }
        }

        private void consumeItem(int item) {
            // Simulate item consumption
        }
    }
}
