package com.stream;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapMultiToIntExample {
    public static void main(String[] args) {
        IntStream result = Stream.of("one", "two", "three")
                .mapMultiToInt((String word, IntConsumer consumer) -> {
                    consumer.accept(word.length());
                    consumer.accept(word.length() * 2);
                });

        result.forEach(System.out::println); // Output: 3, 6, 3, 6, 5, 10
    }
}
