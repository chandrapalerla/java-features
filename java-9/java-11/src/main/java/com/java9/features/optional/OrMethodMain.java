package com.java9.features.optional;

import java.util.Optional;

public class OrMethodMain {

  public static void main(String[] args) {

    Optional<String> optionalValue = Optional.of("Hello, Java 9!");
    Optional<String> optionalValue1 = Optional.empty();

    // or: Returns an Optional describing the value if present, otherwise returns the provided Optional
    Optional<String> fallback = Optional.of("Fallback value");


    String result = optionalValue1.or(() -> fallback).get();
    System.out.println("Result using or(): " + result);
  }

}
