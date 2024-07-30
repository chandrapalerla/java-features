package com.lambdas;

import java.util.function.Predicate;

public class PredicateMain {

  public static void main(String[] args) {
    Predicate<Integer> predicate = (num) -> num > 12;
    System.out.println(predicate.test(13));
    System.out.println(predicate.test(10));
  }

}
