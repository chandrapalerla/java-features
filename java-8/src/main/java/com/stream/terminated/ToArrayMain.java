package com.stream.terminated;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToArrayMain {

  public static void main(String[] args) {
    Stream<String> names = Stream.of("chandu", "komlai", "kaushik");
    String[] array = names.toArray(String[]::new);
    System.out.println(Arrays.toString(array));
  }
}
