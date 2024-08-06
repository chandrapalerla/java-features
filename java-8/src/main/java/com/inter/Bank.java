package com.inter;

@FunctionalInterface
public interface Bank {
    String validateAccountNumber(int accountNumber);
    boolean equals(Object obj);
    int hashCode();
    String toString();
}
