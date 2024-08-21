package com.features.java9.string;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class CharaMain {

  public static void main(String[] args) {
    Optional<String> anotherOptional = Optional.of("Java Stream");

    List<Character> characters = anotherOptional.stream()   // Converts Optional to Stream
        .flatMap(
            s -> s.chars().mapToObj(c -> (char) c))  // FlatMap to get each character as a stream
        .filter(Character::isUpperCase)            // Filter only uppercase characters
        .toList();

  System.out.println(characters);

    String s = "chandrashekar";
    s.chars()
        .forEach(System.out::println);

  }
}
