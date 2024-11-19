package com.garbagecollector;

public interface GarbageCollector {
    void initialize();
    void start();
    void stop();
    void collectGarbage();
}
