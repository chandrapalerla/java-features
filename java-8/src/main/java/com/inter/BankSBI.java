package com.inter;

@FunctionalInterface
interface BankSBI extends Bank{
   String validateAccountNumber(String number);
  
}