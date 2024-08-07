package com.stream.intermedaite;

import com.utility.TestData;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
cover map, flat map,limit,skip
 */
public class FlatMapMain {

  public static void main(String[] args) {
    List<List<Integer>> phoneNumbers = TestData.getPhoneNumbers();
    System.out.println(phoneNumbers);

    List<Integer> collect = phoneNumbers
        .stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
    System.out.println(collect);

    List<Integer> collect1 = TestData.getUserData()
        .stream()
        .filter(user -> user.getUserName().equalsIgnoreCase("maxim"))
        .flatMap(user -> user.getPhoneNumbers().stream())
        .distinct()
        .limit(2)
        .skip(4)
        .toList();

    System.out.println(collect1);
  }
}
