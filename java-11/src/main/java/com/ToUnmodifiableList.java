package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
List.of: This method is available in Java 9 and later. It directly creates an unmodifiable list.
The Collectors.toUnmodifiableList method is available starting from Java 10
he's resulting list is unmodifiable, meaning any attempts to modify it (e.g., by adding or removing elements)
will throw an UnsupportedOperationException.
 */
public class ToUnmodifiableList {
    public static void main(String[] args) {
        //java 9
        List<String> unmodifiableList = List.of("item1", "item2", "item3");

        // This will throw UnsupportedOperationException
        //unmodifiableList.add("item4");

        System.out.println(unmodifiableList);

        List<String> toUnmodifiableList = Arrays.asList("item1", "item2", "item3", "item4");
        List<String> strings = toUnmodifiableList
                .stream()
                .collect(Collectors.toUnmodifiableList());
        strings.add("chandu");

        System.out.println(toUnmodifiableList);

    }
}
