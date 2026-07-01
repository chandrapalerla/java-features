package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodePointsExample {
    public static void main(String[] args) {
        String text = "Hello, 🌍!"; // String with a Unicode emoji

        // Using codePoints() to get an IntStream of Unicode code points
        text.codePoints()
            .forEach(codePoint -> {
                System.out.println("Code point: " + codePoint + " Character: " + Character.toChars(codePoint));
            });

        // Filtering and collecting only alphabetic characters
        String alphabeticOnly = text.codePoints()
            .filter(Character::isAlphabetic)   // Filter only alphabetic characters
            .collect(StringBuilder::new,       // Collect to StringBuilder
                     StringBuilder::appendCodePoint, 
                     StringBuilder::append)
            .toString();

        String list = text.chars().filter(Character::isAlphabetic).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(list);

        System.out.println("Alphabetic characters only: " + alphabeticOnly);

        // Counting the number of code points in the string
        long count = text.codePoints().count();
        System.out.println("Total number of code points: " + count);
    }
}
