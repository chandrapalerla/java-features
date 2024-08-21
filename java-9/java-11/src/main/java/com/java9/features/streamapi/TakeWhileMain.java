package com.java9.features.streamapi;

import java.util.stream.Stream;

public class TakeWhileMain {

  public static void main(String[] args) {
    Stream.of(5, 6, 7, 4, 4, 4, 8, 4, 9, 10)
        .takeWhile(n -> n >= 5)
        .forEach(System.out::println);

    Stream.of("aman", "amar", "suraj", "sura", "suvam", "aahafuj")
        .takeWhile(str -> str.length() == 4)
        .forEach(System.out::println);
  }
}
