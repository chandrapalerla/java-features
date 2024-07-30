package com.inter.staticMethods;

import java.util.function.Predicate;

public class CardTypeImpl implements Predicate<String> {

  @Override
  public boolean test(String s) {
    return false;
  }
}
