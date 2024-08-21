package com.features.java9.string;

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

        System.out.println("Alphabetic characters only: " + alphabeticOnly);

        // Counting the number of code points in the string
        long count = text.codePoints().count();
        System.out.println("Total number of code points: " + count);
    }
}
