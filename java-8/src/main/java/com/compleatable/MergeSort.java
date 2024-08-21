package com.compleatable;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class MergeSort extends RecursiveAction {
    private static final int limit = 5;
    private final int[] array;
    private final int left;
    private final int right;

    public MergeSort(int[] array, int left, int right) {
        this.array = array;
        this.left = left;
        this.right = right;
    }

    @Override
    protected void compute() {
        if (right - left < limit) {
            Arrays.sort(array, left, right + 1);
        } else {
            int mid = left + (right - left) / 2;
            MergeSort leftTask = new MergeSort(array, left, mid);
            MergeSort rightTask = new MergeSort(array, mid + 1, right);
            invokeAll(leftTask, rightTask);
            merge(mid);
        }
    }

    private void merge(int middle) {
        int[] leftArray = Arrays.copyOfRange(array, left, middle + 1);
        int[] rightArray = Arrays.copyOfRange(array, middle + 1, right + 1);

        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //copy remaining elements for left array
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        //copy remaining elements for right array
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}