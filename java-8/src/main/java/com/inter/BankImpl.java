package com.inter;

public class BankImpl implements Bank {

  @Override
  public String validateAccountNumber(int accountNumber) {
    if (accountNumber < 12) {
      return "valid account number";
    } else {
      return "invalid account number";
    }
  }
}
