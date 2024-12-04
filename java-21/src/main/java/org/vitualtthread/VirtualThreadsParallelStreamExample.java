package org.vitualtthread;

import java.util.List;
import java.util.concurrent.Executors;

public class VirtualThreadsParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        try (var executor = Executors.newThreadPerTaskExecutor(Thread.ofVirtual().factory())) {
            numbers.parallelStream()
                   .forEach(number -> executor.submit(() -> {
                       System.out.println("Processing number: " + number);
                   }));
        }
    }
}
