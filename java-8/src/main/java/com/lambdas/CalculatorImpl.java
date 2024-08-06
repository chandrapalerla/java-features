package com.lambdas;

public class CalculatorImpl {
    public static void main(String[] args) {
        Calculator calculator = () -> System.out.println("This is lambda expression");
        calculator.calculate();
    }
}
