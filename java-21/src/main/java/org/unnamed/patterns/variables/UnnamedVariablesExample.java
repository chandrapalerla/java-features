package org.unnamed.patterns.variables;

public class UnnamedVariablesExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int _ : array) {
            // Just iterating through the array without using the values
            System.out.println("Processing...");
        }
    }
}
