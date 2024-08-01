package com.stream.intermedaite;

import com.utility.TestDataUtility;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterMain {

  public static void main(String[] args) {

    List<String> namesList = TestDataUtility.getNamesList();

    for (String name : namesList) {
      if (name.equalsIgnoreCase("pavel")) {
        System.out.println(name);
      }
    }

    Stream<Object> empty = Stream.empty();//1 -way creating stream
    Stream<String> names = Stream.of("chandu", "shekar", "hanc", "mickel");

    Predicate<String> namePredicate = (name) -> {
      return name.equalsIgnoreCase("shekar1");
    };

    names.filter(name -> name.length() > 4).forEach(System.out::println);

  }
}

