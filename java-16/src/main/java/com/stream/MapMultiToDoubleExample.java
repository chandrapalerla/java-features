package com.stream;

import java.util.function.DoubleConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MapMultiToDoubleExample {
    public static void main(String[] args) {
        DoubleStream result = Stream.of("one", "two", "three")
                .mapMultiToDouble((String word, DoubleConsumer consumer) -> {
                    consumer.accept(word.length());
                    consumer.accept(word.length() * 2.5);
                });

        result.forEach(System.out::println); // Output: 3.0, 7.5, 3.0, 7.5, 5.0, 12.5
    }
}
