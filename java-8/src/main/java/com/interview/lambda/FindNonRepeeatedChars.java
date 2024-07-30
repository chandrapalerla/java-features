package com.interview.lambda;

import java.util.Arrays;

public class FindNonRepeeatedChars {
    public static void main(String[] args) {
        // find the first non repeated character. (Google interview)
        //out put: q
        String input = "the quick brown fox jumps over the lazy dog";

        String res = Arrays.stream(input.split(""))
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c)).findFirst().get();
        System.out.println(res);

    }
}
