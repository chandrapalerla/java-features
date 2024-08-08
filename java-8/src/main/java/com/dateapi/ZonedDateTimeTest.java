package com.dateapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
    public static void main(String[] args) {
//        for (String zoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zoneId);
//        }

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("US/Central"));
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

    }
}
