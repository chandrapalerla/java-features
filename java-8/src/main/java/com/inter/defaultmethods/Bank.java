package com.inter.defaultmethods;

public interface Bank {

  boolean validate(String num);

  default void withDrawCash(int amount) {
    if (amount > 5000) {
      System.out.println("cash is available");
    } else {
      System.out.println("cash is not available");
    }
  }
}
