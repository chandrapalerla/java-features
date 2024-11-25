# Java 12 Features

1 Switch Expressions

    Switch expressions provide a simpler and more expressive way to write switch statements,
    enabling switch to be used as an expression.

2 Shenandoah Low-Pause-Time Garbage Collector

    Shenandoah is a new garbage collector that aims to reduce GC pause times.
    To enable Shenandoah GC, you can use the JVM option:
    -XX:+UseShenandoahGC

3  Microbenchmark Suite

4  JVM Constants API (JEP 334)

5 One AArch64 Port, Not Two (JEP 340)

    This improvement consolidates the two existing AArch64 ports into a single port 
    to reduce duplication and maintenance effort.

6  Default CDS Archives (JEP 341)

    Enhances the JDK build process to generate a class-data sharing (CDS) archive by default, improving startup time.

7 Abortable Mixed Collections for G1 (JEP 344)

    This enhancement allows G1 to abort garbage collection (GC) mixed collections if they exceed the pause time goal.
    Example: To enable abortable mixed collections:
    -XX:+UseG1GC -XX:G1MixedGCCountTarget=8


8 Promptly Return Unused Committed Memory from G1 (JEP 346)

    Improves G1 to return unused committed memory to the operating system more promptly, reducing the memory footprint of idle applications.
    Example: To configure the memory reclamation:
    -XX:+UseG1GC -XX:G1PeriodicGCInterval=2000

9 Compact Number Formatting

    The new CompactNumberFormat class allows for formatting numbers in a compact form.
    NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.FRENCH, NumberFormat.Style.SHORT);
    NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.FRENCH, NumberFormat.Style.LONG);