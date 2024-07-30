package com.interview.dateapi;

import java.time.LocalDateTime;

public class AlteringDates {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //plus and minus
        LocalDateTime localDateTime1 = localDateTime.plusDays(10);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = localDateTime.minusDays(8);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3 = localDateTime.withDayOfMonth(10);
        System.out.println(localDateTime3);
    }
}
