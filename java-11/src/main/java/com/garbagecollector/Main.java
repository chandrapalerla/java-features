package com.garbagecollector;

public class Main {
    public static void main(String[] args) {
        var markAndSweepGC = new MarkAndSweepGarbageCollector();
        var refCountingGC = new ReferenceCountingGarbageCollector();

        manageGarbageCollector(markAndSweepGC);
        manageGarbageCollector(refCountingGC);
    }

    private static void manageGarbageCollector(GarbageCollector gc) {
        gc.initialize();
        gc.start();
        gc.collectGarbage();
        gc.stop();
    }
}
