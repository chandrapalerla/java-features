package com.features.java9.collectionapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 List: List.of()
 Set: Set.of()
 Map: Map.ofEntries
 */
public class ImmutableCollectionMain {

  public static void main(String[] args) {
    List<String> names = List.of("chandu", "shekar");
    //names.add("kaushik");
    System.out.println("after Java 9::::" + names);

    Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //numbers.add(11);

    System.out.println(numbers);

    Map<Integer, String> idNames = Map.ofEntries(
        Map.entry(1, "chandu"), Map.entry(2, "shekar")
    );
    // idNames.put(3, "kaushik");
    System.out.println(idNames);

    Set<Integer> integers = new HashSet<>();
    integers.add(1);
    integers.add(2);

    System.out.println(integers);

    Set<Integer> integers1 = Collections.unmodifiableSet(integers);
    integers1.add(3);
    integers1.add(3);
    System.out.println(integers1);

    Map<Character, String> firstName = new HashMap<>();
    firstName.put('c', "chandu");
    System.out.println(firstName);
    Map<Character, String> characterStringMap = Collections.unmodifiableMap(firstName);
    characterStringMap.put('s', "shekar");
    System.out.println(characterStringMap);


  }
}
