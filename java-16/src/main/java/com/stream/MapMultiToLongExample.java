package com.stream;

import java.util.function.LongConsumer;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MapMultiToLongExample {
    public static void main(String[] args) {
        LongStream result = Stream.of("one", "two", "three")
                .mapMultiToLong((String word, LongConsumer consumer) -> {
                    consumer.accept(word.length());
                    consumer.accept(word.length() * 3L);
                });

        result.forEach(System.out::println); // Output: 3, 9, 3, 9, 5, 15
    }
}
