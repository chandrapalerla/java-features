package com.dateapi;

import java.time.*;

public class LocalDateTimeExamples {
    public static void main(String[] args) {

        //localdate
        LocalDate now = LocalDate.now();
        LocalDate of = LocalDate.of(2023, 8, 15);
        LocalDate localDate = LocalDate.of(2022, Month.AUGUST, 10);

        System.out.println(now);
        System.out.println(of);
        System.out.println(localDate);

        //localTIme
        LocalTime now1 = LocalTime.now();
        LocalTime localTime = LocalTime.of(10, 22);

        System.out.println(now1);
        System.out.println(localTime);

        //Month

        MonthDay month = MonthDay.of(10, 10);
        System.out.println(month.atYear(2022));

        YearMonth yearMonth = YearMonth.of(2016, Month.DECEMBER);
        LocalDate yearMonthOfDay = yearMonth.atDay(16);
        System.out.println(yearMonthOfDay);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime of1 = LocalDateTime.of(2023, Month.AUGUST, 18, 12, 24, 55);
        System.out.println(of1);
        System.out.println(localDateTime);

    }
}
