package com.streamapi;

import java.util.Random;
import java.util.stream.Stream;

public class IterateMain {

  public static void main(String[] args) {
    //creating stream
    //1. Stream.of()2.Stream.empty(),3.Stream.ofNullable,4 Stream.iterate(),5. Stream.generate()
    Stream.iterate(5, num -> num + 2).limit(10)
        .forEach(System.out::println);

    Stream.iterate("chandu", num -> num + 2).limit(10)
        .forEach(System.out::println);

    Stream.generate(new Random()::nextInt)
        .limit(5).forEach(System.out::println);
  }
}
