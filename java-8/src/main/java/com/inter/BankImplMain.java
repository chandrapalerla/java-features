package com.inter;

public class BankImplMain {

  public static void main(String[] args) {
    BankImpl bank = new BankImpl();
    String validateAccountNumber = bank.validateAccountNumber("1243546879");
    System.out.println(validateAccountNumber);
  }
}
