package com.interview.dateapi;

import java.time.LocalDateTime;

public class ComparingDates {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 10, 12, 11, 34);
        int i = localDateTime.compareTo(localDateTime1);
        System.out.println(i);
        System.out.println(localDateTime.isAfter(localDateTime1));
        System.out.println(localDateTime.isBefore(localDateTime1));
        System.out.println(localDateTime.isEqual(localDateTime1));

    }
}
