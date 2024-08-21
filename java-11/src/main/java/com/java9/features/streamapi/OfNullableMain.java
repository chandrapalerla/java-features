package com.java9.features.streamapi;

import java.util.Optional;
import java.util.stream.Stream;

public class OfNullableMain {

  public static void main(String[] args) {
    String input1 = null;
    Optional<String> optional2 = Optional.ofNullable(input1);//Optional.of(),Optional.empty()
    optional2.ifPresent(System.out::println);
    
    Stream.ofNullable("null")
        .forEach(System.out::println);
  }
}
