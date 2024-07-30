package com.interview.dateapi;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationTest {
    public static void main(String[] args) {
        Duration of = Duration.of(10, ChronoUnit.DAYS);
        System.out.println(of);

    }
}
