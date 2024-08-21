package com.java9.features.optional;

import com.utility.TestData;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class StreamMain {

  public static void main(String[] args) {
    Optional<List<String>> namesList = TestData.getNamesList();
    namesList.stream()
        .flatMap(Collection::stream)
        .filter(name -> name.length() > 5)
        .forEach(System.out::println);

  }
}
