package com.interview.lambda;

import java.util.function.Predicate;

public class PredicateExmaple {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = (num) -> num % 2 == 0;
        System.out.println(integerPredicate.test(5));
    }
}
