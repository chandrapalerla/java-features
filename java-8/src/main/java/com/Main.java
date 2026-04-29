package com;

import java.util.*;
import java.util.stream.*;

public class Main {

    // Function signature: public static List<Integer> sortByFrequency(int[] nums)
    public static List<Integer> sortByFrequency(int[] nums) {
        Map<Integer , Long> frequencyMap = Arrays.stream(nums)
        .boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        // write your code here
        return Arrays.stream(nums)
        .boxed()
        .sorted((a , b)-> {
            int freqCompare = frequencyMap.get(b)
        .compareTo(frequencyMap.get(a));
        
        if(freqCompare != 0){
            return freqCompare;
        }
        return Integer.compare(a,b);
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example input: [4, 6, 2, 5, 2, 3, 3, 3]
        // Expected output: [3, 3, 3, 2, 2, 4, 5, 6]
        int[] nums = {4, 6, 2, 5, 2, 3, 3, 3};
       List<Integer> sorted = sortByFrequency(nums);
        System.out.println(sorted);
    }
}
