package com.lambdas;

import com.inter.Bank;

public class LambdasMain {

  public static void main(String[] args) {
    Bank bank1 = (accountNumber)->{
        return "valid account number";
    };
    String validateAccountNumber = bank1.validateAccountNumber(String.valueOf(1243546879));
    System.out.println(validateAccountNumber);
  }
}
