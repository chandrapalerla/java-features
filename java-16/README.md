# Java 16 Features

1. Pattern Matching for instanceof (JEP 394)

2. Records (JEP 395) 

3. Local Variable var in Record Patterns (Preview - JEP 405)

        Enhances the record pattern with local variable type inference (var).
4. Sealed Classes (Second Preview - JEP 397)
5. Foreign Function and Memory API (Incubator - JEP 412)
6. Vector API (Incubator - JEP 338)
7. Stream Class:
        a. default mapMulti(BiConsumer<? super T, ? super Consumer<R>> mapper) 
        b. default IntStream mapMultiToInt(BiConsumer<? super T, ? super IntConsumer> mapper)
        c. default LongStream mapMultiToLong(BiConsumer<? super T, ? super LongConsumer> mapper)
        d. default DoubleStream mapMultiToDouble(BiConsumer<? super T, ? super DoubleConsumer> mapper)
        e. default List<T> toList()