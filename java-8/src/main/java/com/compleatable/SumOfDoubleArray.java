package com.compleatable;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.stream.DoubleStream;

public class SumOfDoubleArray {
    private static final int MAX_SIZE = 500_000_000;

    public static void main(String[] args) {
        double[] result = new double[1];
        SumOfDoubleArrayForkJoin forkJoinSumOfSquares = new SumOfDoubleArrayForkJoin(getDoubleArray(), 0, MAX_SIZE, result);
        ForkJoinPool pool = new ForkJoinPool();
        long startTime = System.nanoTime();
        pool.invoke(forkJoinSumOfSquares);
        long endTime = System.nanoTime();
        System.out.println(" time of execution is::::" + (endTime - startTime));

        long startTimeForNormal = System.nanoTime();
        double sum = DoubleStream.of(getDoubleArray()).map(val -> val * val).sum();
        long endTimeForNormal = System.nanoTime();
        System.out.println(" time of execution is normal::::" + (endTimeForNormal - startTimeForNormal));

        System.out.println(endTimeForNormal + ":::::::::" + result[0]);

    }

    private static double[] getDoubleArray() {
        double[] array = new double[MAX_SIZE];
        Random random = new Random();
        for (int i = 0; i < MAX_SIZE; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

}

class SumOfDoubleArrayForkJoin extends RecursiveAction {
    private final double[] array;
    private final int start;
    private final int end;
    private final double[] result;

    public SumOfDoubleArrayForkJoin(double[] array, int start, int end, double[] result) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.result = result;
    }

    @Override
    protected void compute() {
        if (end - start <= 10_000) {
            double sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i] * array[i];
            }
            result[0] += sum;
        } else {
            int mid = (start + end) / 2;
            SumOfDoubleArrayForkJoin leftTask = new SumOfDoubleArrayForkJoin(array, start, mid, result);
            SumOfDoubleArrayForkJoin rightTask = new SumOfDoubleArrayForkJoin(array, mid, end, result);

            leftTask.fork();
            rightTask.compute();
            leftTask.join();
        }
    }
}
