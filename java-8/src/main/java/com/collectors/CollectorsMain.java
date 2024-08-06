package com.collectors;

import com.utility.TestDataUtility;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMain {

  public static void main(String[] args) {
    List<String> sonnets = TestDataUtility.getSonnet();
    Map<String, String> collect = sonnets.stream().
        collect(Collectors.toMap(line -> line.substring(0, 1),
            line -> line, (line1, line2) -> line1 + "\n" + line2));
    System.out.println(collect);

    Map<String, List<String>> collect1 = sonnets.stream()
        .collect(Collectors.groupingBy(line -> line.substring(0, 1)));
    System.out.println(collect1);

  }
}
