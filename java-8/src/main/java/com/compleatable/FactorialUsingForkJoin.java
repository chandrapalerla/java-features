package com.compleatable;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FactorialUsingForkJoin {
    public static void main(String[] args) {
        BigInteger factorial = getFactorial(5);
        System.out.println("factorial:::::::" + factorial);
        int number = 5;  // You can change this to test other values
        ForkJoinPool pool = new ForkJoinPool();
        FactorialForkJoin task = new FactorialForkJoin(1, number);
        BigInteger factForkJoin = pool.invoke(task);
        System.out.println("factForkJoin:::::" + factForkJoin);
    }

    private static BigInteger getFactorial(int number) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}

class FactorialForkJoin extends RecursiveTask<BigInteger> {
    private final int start;
    private final int n;

    public FactorialForkJoin(int start, int number) {
        this.start = start;
        this.n = number;
    }

    @Override
    protected BigInteger compute() {
        if (n - start <= 3) {
            BigInteger result = BigInteger.ONE;
            for (int i = start; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        } else {
            int mid = start + (n - start) / 2;
            FactorialForkJoin leftForkJoin = new FactorialForkJoin(start, mid);
            FactorialForkJoin rightForkJoin = new FactorialForkJoin(mid + 1, n);
            leftForkJoin.fork();
            BigInteger rightResult = rightForkJoin.compute();
            BigInteger leftResult = leftForkJoin.join();
            return leftResult.multiply(rightResult);
        }
    }
}