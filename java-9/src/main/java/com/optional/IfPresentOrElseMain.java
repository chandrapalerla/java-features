package com.optional;

import com.utility.TestData;
import java.util.List;
import java.util.Optional;

public class IfPresentOrElseMain {

  public static void main(String[] args) {

    Optional<List<String>> namesList = Optional.of(TestData.getNamesList());
    namesList.ifPresentOrElse(list -> {
          list.stream().filter(name -> name.length() > 5).forEach(System.out::println);
        },
        () -> System.out.println("value is not exist"));

    Optional<String> valueAbsent = Optional.empty();
    valueAbsent.ifPresentOrElse(
        v -> System.out.println("Value is present, it's: " + v),
        () -> System.out.println("Value is absent!")
    );

  }
}
