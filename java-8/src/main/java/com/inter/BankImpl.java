package com.inter;

public class BankImpl implements Bank {

  @Override
  public String validateAccountNumber(String accountNumber) {
    if (accountNumber.length() < 12) {
      return "valid account number";
    } else {
      return "invalid account number";
    }
  }
}
