package com.compleatable;

import java.util.concurrent.RecursiveTask;

public class FibonacciSeries extends RecursiveTask<Long> {

    private static final int LIMIT = 10;
    private final int number;

    public FibonacciSeries(int number) {
        this.number = number;
    }

    @Override
    protected Long compute() {
        if (number <= LIMIT) {
            return getFibonacci(number);
        } else {
            FibonacciSeries fib1 = new FibonacciSeries(number - 1);
            FibonacciSeries fib2 = new FibonacciSeries(number - 2);
            fib1.fork();
            Long fib2Result = fib2.compute();
            Long fib1Result = fib1.join();
            return fib1Result + fib2Result;
        }
    }

    private long getFibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        long a = 0, b = 1;
        for (int i = 2; i <= number; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}