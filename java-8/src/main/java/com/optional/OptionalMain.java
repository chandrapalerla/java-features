package com.optional;

import java.util.Optional;

public class OptionalMain {

  public static void main(String[] args) {

    String input1 = "abc";
    String input2 = null;
    Optional<String> optional1 = Optional.of(input1);//non nullable value
    System.out.println(optional1.get());
    System.out.println(optional1.isEmpty());

    Optional<String> optional2 = Optional.ofNullable(input2);
    if (optional2.isPresent()) {
      System.out.println(optional2.get());
    }
    System.out.println(optional2.isEmpty());

    Optional<String> optional3 = Optional.empty();
    optional3.ifPresent(s -> System.out.println(s + "shekar"));
    System.out.println(optional3.isEmpty());

    //orElse
    System.out.println(optional1.orElse("shekar"));
    System.out.println(optional3.orElse("chandu"));//new Employee();
    //orElseGet
    System.out.println(optional1.orElseGet(OptionalMain::getName));//Calling DB or service
    System.out.println(optional3.orElseGet(OptionalMain::getName));
    optional3.orElseThrow(() -> new RuntimeException("values is not present in optional class"));

    //OrElseThrow
  }

  private static String getName() {
    return "shekar";
  }
}
