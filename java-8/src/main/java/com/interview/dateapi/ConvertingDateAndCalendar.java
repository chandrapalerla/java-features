package com.interview.dateapi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConvertingDateAndCalendar {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);

        Calendar calendar = Calendar.getInstance();
        LocalDate localDate1 = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate1);

    }
}
