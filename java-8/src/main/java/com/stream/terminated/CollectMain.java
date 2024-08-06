package com.stream.terminated;

import com.utility.TestDataUtility;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectMain {

  public static void main(String[] args) {
    List<String> alphabet = TestDataUtility.getAlphabet();

    List<String> collect = alphabet.stream()
        .filter(str -> str.length() > 5)
        .collect(Collectors.toList());
    System.out.println(collect);

    Set<String> collect1 = alphabet
        .stream()
        .map(str -> str + " mikel")
        .collect(Collectors.toSet());
    System.out.println(collect1);

    List<String> sonnet = TestDataUtility.getSonnet();

    Map<String, String> collect2 = sonnet.stream().
        collect(Collectors.toMap(line -> line.substring(0, 1),
            Function.identity(), (line1, line2) -> line1 + "\n" + line2));
    System.out.println(collect2);

    System.out.println(":::::::::collectors joining::::");

    String collect3 = alphabet.stream()
        .collect(Collectors.joining(","));
    System.out.println(collect3);

    System.out.println(":::::::::collectors Group By::::");
    Map<String, List<String>> groupBy = sonnet.stream()
        .collect(Collectors.groupingBy(line -> line.substring(0, 1)));
    System.out.println(groupBy);
  }
}
