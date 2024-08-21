package com.features.java9.streamapi;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropWhileMain {

  public static void main(String[] args) {
    Stream<Integer> stream = Stream.of(4, 4, 4, 5, 6, 7, 8, 4, 9, 10);

    Predicate<Integer> predicate = number -> (number == 4);
    List<Integer> collect = stream.dropWhile(predicate).collect(Collectors.toList());
    System.out.println(collect);

    Stream<String> stream1 = Stream.of("aman", "amar", "suraj", "suvam", "aahafuj");

    // apply dropWhile to drop all the names
    // matches passed predicate
    List<String> list
        = stream1.dropWhile(name -> (name.charAt(0) == 'a'))
        .collect(Collectors.toList());

    System.out.println(list);
  }
}
