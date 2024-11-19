package com;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
The resulting set is unmodifiable, meaning any attempts to modify it (e.g., by adding or removing elements)
will throw an UnsupportedOperationException
 */
public class ToUnmodifiableSet {
    public static void main(String[] args) {
        Set<String> unmodifiableSet = Stream.of("item1", "item2", "item3")
                .collect(Collectors.toUnmodifiableSet());
        unmodifiableSet.add("item4");

        System.out.println(unmodifiableSet);
    }
}
