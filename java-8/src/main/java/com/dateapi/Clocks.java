package com.dateapi;

import java.time.Clock;

public class Clocks {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);

    }
}
