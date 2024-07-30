package com.interview.dateapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        String format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(localDateTime);
        System.out.println(format);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd hh:mm");
        String format1 = dateTimeFormatter.format(localDateTime);
        System.out.println(format1);

    }
}
