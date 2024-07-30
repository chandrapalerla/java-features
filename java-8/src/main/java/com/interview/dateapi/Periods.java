package com.interview.dateapi;

import java.time.LocalDate;
import java.time.Period;

public class Periods {
    public static void main(String[] args) {
        LocalDate localDateTime = LocalDate.now();
        LocalDate localDateTime1 = LocalDate.of(2023, 10, 12);
        Period period = Period.ofDays(10);
        System.out.println(period);

        Period between = Period.between(localDateTime, localDateTime1);
        System.out.println(between);

    }
}
