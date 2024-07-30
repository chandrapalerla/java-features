package com.inter.defaultmethods;

public class BankMain {

  public static void main(String[] args) {
    Bank bank = (num) -> Integer.parseInt(num) > 12;
    System.out.println(bank.validate("15"));
    bank.withDrawCash(2500);

    BankImpl bank1 = new BankImpl();
    bank1.withDrawCash(12000);
  }
}
