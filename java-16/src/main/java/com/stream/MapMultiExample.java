package com.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MapMultiExample {
    public static void main(String[] args) {
        List<String> result = Stream.of("apple", "banana", "cherry")
                .mapMulti((String fruit, Consumer<String> consumer) -> {
                    consumer.accept(fruit.toUpperCase());
                    consumer.accept(fruit.toLowerCase());
                })
                .toList(); // Collectors.toList() in earlier versions

        System.out.println(result); // Output: [APPLE, apple, BANANA, banana, CHERRY, cherry]
    }
}
