package com.inter.defaultmethods;

public class BankImpl implements Bank{

  @Override
  public boolean validate(String num) {
    return false;
  }

  @Override
  public void withDrawCash(int amount) {
    Bank.super.withDrawCash(amount);
    System.out.println("cash is available");
  }
}
