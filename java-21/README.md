# Java 21 Features

1. String Templates (Preview)

       Templates simplify writing and reading of Java programs that generate strings, particularly those that embed values 
       and expressions. This feature enhances readability and maintainability, 
       making it easier to work with complex strings that include variable substitutions.

2. Sequenced Collections

         New Methods for List, Set, and Map: New methods are added to these interfaces to support sequenced operations.
       List and Set Enhancements

       reversed(): Returns a view of the list/set with the order reversed.
       addFirst(E e): Adds the specified element to the beginning of the list/set.
       addLast(E e): Adds the specified element to the end of the list/set.
       getFirst(): Retrieves, but does not remove, the first element of the list/set.
       getLast(): Retrieves, but does not remove, the last element of the list/set.
       removeFirst(): Retrieves and removes the first element of the list/set.
       removeLast(): Retrieves and removes the last element of the list/set.

3. Generational ZGC

       enhancing the existing Z Garbage Collector by adding support for generational garbage collection. 
       This feature aims to improve the performance and efficiency of memory management in Java applications,
        especially for those with a high allocation rate and a large heap.
       Enable Genrational ZGC:
       java -XX:+UseZGC -XX:+ZGenerational -jar YourApp.jar

4. Record Patterns(Standard)

       Key Features of Record Patterns
       Pattern Matching with Records: Allows the use of record patterns in instanceof checks, switch statements, and enhanced for loops.
       Concise Deconstruction: Simplifies the deconstruction of record components directly in patterns, reducing boilerplate code.
       Enhanced Readability: Improves code readability and maintainability by making the intention of deconstructing and extracting values clear.

5. Pattern Matching for switch(standard)

       switch expressions and statements, enhancing the expressiveness and readability of Java by allowing sophisticated data queries and manipulations directly 
       within switch. This feature is part of the ongoing effort to make pattern matching a more integral part of the Java language,
       following the inclusion of pattern matching for instanceof and record patterns.

       Key Features of Pattern Matching for switch
       Enhanced switch Expressions and Statements: Extends switch to support pattern matching, enabling more complex and concise logic.
       Type Patterns: Allows matching against types directly in switch cases.
       Guarded Patterns: Supports adding conditions (guards) to patterns within switch cases.
       Exhaustiveness Checking: The compiler ensures all possible cases are handled, improving reliability and reducing errors.
       Sealed Types Integration: Works seamlessly with sealed types, ensuring that all subtypes are covered.
   
6. Foreign Function & Memory API (Third Preview)
7. Unnamed Patterns and Variables (Preview)

       which enhances the language by allowing more concise and readable code when some variables are not needed. This feature is useful in pattern matching and destructuring, where you might not always need all components of a pattern.

       Key Features of Unnamed Patterns and Variables
       Unnamed Patterns: Use _ to indicate that a pattern exists but the value is ignored.
       Unnamed Variables: Use _ to declare a variable whose value is intentionally unused.
       Improved Code Readability: Helps to avoid cluttering the code with unnecessary variable names.
       Compiler Enforcement: The compiler ensures that unnamed variables are not accessed, preventing accidental usage.

8. Virtual Threads(standard)

       They are a key part of Project Loom, which aims to reduce the complexity of writing, maintaining, and observing high-throughput concurrent applications.

       Key Features of Virtual Threads
       Lightweight Threads: Virtual threads are much lighter than platform (OS) threads, enabling the creation of millions of threads without overwhelming system resources.
       Simplified Concurrency: Virtual threads simplify the development of concurrent applications by allowing developers to use the familiar thread-per-task model.
       Improved Scalability: By reducing the overhead associated with traditional threads, virtual threads improve the scalability of applications.
       Seamless Integration: Virtual threads integrate seamlessly with existing Java code and libraries, allowing for easy adoption.

9. Unnamed Classes and Instance Main Methods (Preview)

       streamlining the process of writing small programs and reducing boilerplate code. This feature is part of Project Amber, 
       which aims to enhance Java with productivity-oriented language features.

       Unnamed Classes: Allows for writing main methods directly in an unnamed class, eliminating the need for explicitly naming a class.
       Instance Main Methods: Supports defining the main method as an instance method rather than a static method.
       Simplified Entry Points: Reduces the boilerplate code required to define the entry point of a Java application.
       Enhanced Readability: Makes small programs and scripts more readable by removing unnecessary syntactic elements.

10. Scoped Values (Preview)

        aiming to provide a safe and efficient way to share data within and across threads. This feature is particularly useful for context-specific data that needs to be accessible throughout the execution of certain code blocks, but without the risks and complexities associated with thread-local variables.
      
        Key Features of Scoped Values
        Scoped Values: A mechanism to share data safely across threads, with a well-defined lifecycle and scope.
        Enhanced Performance: Scoped values are designed to be more performant than thread-local variables, particularly in highly concurrent environments.
        Controlled Sharing: Scoped values ensure that data is shared only within the intended scope, preventing accidental or unsafe access.
        Improved Code Safety: By confining data access to specific scopes, scoped values reduce the risk of data leaks and race conditions.
         Basic Usage
         Defining and Using Scoped Values
        Scoped values are defined using the ScopedValue class, and they are typically used within a try-with-resources block to ensure proper lifecycle management

11. Vector API (Sixth Incubator)
12. Deprecate the Windows 32-bit x86 Port for Removal
13. Prepare to Disallow the Dynamic Loading of Agents
14. Key Encapsulation Mechanism API
15. Structured Concurrency (Preview)