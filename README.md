# java 8 Features
1.Functional Interface(customized consumer, predicate)

2.default methods

3.static methods

4.Lambdas

5.Method references

6.optional

7.Data and time

8.completable feature

9.metaspace

10.stream api(intermediate stream, terminated stream)

11.collectors class methods

12.comparator(adding default and static methods)

# Java 9 features:

1. Module System
2. Jshell 
3. interface changes: added private methods
4. stream API improvements

    drop while
    takeWhile
    ofNullable
    iterate

5. Optional class API improvements

   ifPresentOrElse
   or
   stream

6. collector class API improvements

   flat mapping
   filtering
   
7. String class API improvements

  chars
  codePoints
  
8. Try-With-Resources Improvement

# Java 10 features:

1. Local-Variable Type Inference

   example:

        var list = new ArrayList<String>(); // infers ArrayList<String>
        var stream = list.stream();         // infers Stream<String>
2.toUnmodifiableList
  example:

    List<String> strings = toUnmodifiableList
    .stream()
    .collect(Collectors.toUnmodifiableList());

3.tounmodifiableSet

    Set<String> unmodifiableSet = Stream.of("item1", "item2", "item3")
    .collect(Collectors.toUnmodifiableSet());
    unmodifiableSet.add("item4");

4. toUnmodifiableMap

   Map<Integer, String> unmodifiableMap = Stream.of("item1", "item2", "item3", "it")
   .collect(Collectors.toUnmodifiableMap(
   String::length, // Key mapper
   s -> s, // Value mapper
   (existing, replacement) -> existing + ", " + replacement // Merger function
   ));

5. orElseThrow

   Optional<String> optional = Optional.ofNullable(getValue());
   String value = optional.orElseThrow(() -> new IllegalArgumentException("Value must be present"));

