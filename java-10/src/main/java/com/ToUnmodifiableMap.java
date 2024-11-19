package com;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Collectors.toUnmodifiableMap: The resulting map is unmodifiable, meaning any attempts to modify it
(e.g., by adding or removing entries) will throw an UnsupportedOperationException
 */
public class ToUnmodifiableMap {

    public static void main(String[] args) {

        // 1 .  Collector<T, ?, Map<K,U>> toUnmodifiableMap(Function<? super T, ? extends K> keyMapper,
        //                                                Function<? super T, ? extends U> valueMapper,
        //                                                 BinaryOperator<U> mergeFunction)

        Map<Integer, String> unmodifiableMap = Stream.of("item1", "item2", "item3", "it")
                .collect(Collectors.toUnmodifiableMap(
                        String::length, // Key mapper
                        s -> s, // Value mapper
                        (existing, replacement) -> existing + ", " + replacement // Merger function
                ));
        unmodifiableMap.put(3, "tes");
        System.out.println(unmodifiableMap);
    }
}
