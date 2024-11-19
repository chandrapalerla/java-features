package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExample {

  public static void main(String[] args) {
    List<String> programmingLanguages = Arrays.asList("Java", "Kotlin", "Scala", "Python",
        "JavaScript", "Ruby");

    // Example using Collectors.filtering
    Map<Integer, List<String>> filteredByLength = programmingLanguages.stream()
        .collect(Collectors.groupingBy(
            String::length,    // Group by the length of the string
            Collectors.filtering(
                s -> s.startsWith("J"), // Only keep elements that start with "J"
                Collectors.toList()     // Collect the filtered results into a List
            )
        ));

    System.out.println("Grouped and filtered by length: " + filteredByLength);

    // Example using Collectors.flatMapping
    List<List<String>> nestedList = Arrays.asList(
        Arrays.asList("Java", "Kotlin", "Scala"),
        Arrays.asList("Python", "JavaScript"),
        Arrays.asList("Go", "Rust", "C++")
    );

    //Stream class flat map example
    List<String> collect = nestedList
        .stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toList());

    System.out.println(collect);

//    Map<String, List<Integer>> collect1 = TestData.getUserData().stream()
//        .collect(Collectors.groupingBy(
//            User::getUserName,
//            Collectors.flatMapping(
//                user -> user.getPhoneNumbers().stream(),
//                Collectors.toList()
//            )));

//    System.out.println(collect1);

    Map<Integer, Set<String>> flattenedAndGrouped = nestedList.stream()
        .collect(Collectors.groupingBy(
            List::size,    // Group by the size of the inner lists
            Collectors.flatMapping(
                List::stream,        // Flatten the nested lists
                Collectors.toSet()   // Collect the flattened results into a Set
            )
        ));
    System.out.println("Flattened and grouped by inner list size: " + flattenedAndGrouped);
  }
}
