package com.interview;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringPermutations {

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        permutations.forEach(System.out::println);
    }

    public static List<String> generatePermutations(String input) {
        return generatePermutations("", input)
                .collect(Collectors.toList());
    }

    private static Stream<String> generatePermutations(String prefix, String remaining) {
        int length = remaining.length();
        return length == 0 ?
                Stream.of(prefix) :
                IntStream.range(0, length)
                        .mapToObj(i -> generatePermutations(prefix + remaining.charAt(i),
                                remaining.substring(0, i) + remaining.substring(i + 1, length)))
                        .flatMap(Function.identity());
    }
}
