package com.garbagecollector;

public class ReferenceCountingGarbageCollector implements GarbageCollector {
    @Override
    public void initialize() {
        System.out.println("Reference Counting GC initialized.");
    }

    @Override
    public void start() {
        System.out.println("Reference Counting GC started.");
    }

    @Override
    public void stop() {
        System.out.println("Reference Counting GC stopped.");
    }

    @Override
    public void collectGarbage() {
        System.out.println("Reference Counting GC collecting garbage...");
        // Perform reference counting
        System.out.println("Reference Counting GC completed garbage collection.");
    }
}
