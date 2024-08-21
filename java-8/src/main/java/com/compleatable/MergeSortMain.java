package com.compleatable;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class MergeSortMain {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("Before sorting::::" + Arrays.toString(numbers));
        ForkJoinPool pool = new ForkJoinPool();
        MergeSort task = new MergeSort(numbers, 0, numbers.length - 1);
        pool.invoke(task);
        System.out.println("After sorting::::" + Arrays.toString(numbers));
    }
}