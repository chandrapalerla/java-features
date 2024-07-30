package com.lambdas;

import com.inter.Bank;

public class LambdasMain {

  public static void main(String[] args) {
    Bank bank1 = (accountNumber)->{
      if (accountNumber < 12) {
        return "valid account number";
      } else {
        return "invalid account number";
      }
    };
    String validateAccountNumber = bank1.validateAccountNumber(1243546879);
    System.out.println(validateAccountNumber);
  }
}
