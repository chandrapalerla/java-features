package com.stream.terminated;

import com.bean.City;
import com.bean.Product;
import com.utility.TestData;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectMain {

  public static void main(String[] args) {
    List<String> alphabet = TestData.getAlphabet();

    List<String> collect = alphabet.stream()
        .filter(str -> str.length() > 5)
        .collect(Collectors.toList());
    System.out.println(collect);

    Set<String> collect1 = alphabet
        .stream()
        .map(str -> str + " mikel")
        .collect(Collectors.toSet());
    System.out.println(collect1);

    List<String> sonnet = TestData.getSonnet();

    Map<String, String> collect2 = sonnet.stream().
        collect(Collectors.toMap(line -> line.substring(0, 1),
            Function.identity(), (line1, line2) -> line1 + "\n" + line2));
    System.out.println(collect2);

    System.out.println(":::::::::collectors joining::::");

    String collect3 = String.join(",", alphabet);
    System.out.println(collect3);

    System.out.println(":::::::::collectors Group By::::");
    Map<String, List<String>> groupBy = sonnet.stream()
        .collect(Collectors.groupingBy(line -> line.substring(0, 1)));
    System.out.println(groupBy);

    System.out.println(":::::Collectors to collection:::::");

    List<City> cities = TestData.prepareTemperature();

    Collection<City> collect4 = cities.stream()
        .collect(Collectors.toCollection(LinkedHashSet::new));
    System.out.println(collect4);

    System.out.println("::::Collectors collectingAndThen::::::");

    Map<String, Long> collectingThen = cities.stream()
        .collect(Collectors.groupingBy(City::getName,
            Collectors.collectingAndThen(Collectors.counting(), city -> city)));

    System.out.println(collectingThen);

    System.out.println("::::Collectors counting::::::");
    Map<String, Long> collectorsCounting = cities
        .stream()
        .collect(Collectors.groupingBy(City::getName, Collectors.counting()));
    System.out.println(collectorsCounting);

    System.out.println(":::::Collectors joining prefix, suffix::::::");

    String collectorsJoining = TestData.getAlphabet().stream()
        .map(str -> "mike" + str + "rock")
        .collect(Collectors.joining(",", "Prefix:::", "::::Suffix"));
    System.out.println(collectorsJoining);

    System.out.println("::::::::::Collectors mapping::::::::::");
    Map<String, Set<Double>> collectorsMapping = cities
        .stream()
        .collect(Collectors.groupingBy(City::getName,
            Collectors.mapping(City::getTemperature, Collectors.toSet())));
    System.out.println(collectorsMapping);

    System.out.println(":::::::Collectors partitioningBy::::::::");
    Map<Boolean, List<City>> collectorsPartitionBy = cities
        .stream()
        .collect(Collectors.partitioningBy(city -> city.getTemperature() > 25));
    System.out.println(collectorsPartitionBy);

    System.out.println(":::::::Collectors partitioningBy downStream::::::::");
    Map<Boolean, Long> collectorsPartitionByDownStream = cities
        .stream()
        .collect(
            Collectors.partitioningBy(city -> city.getTemperature() > 25, Collectors.counting()));
    System.out.println(collectorsPartitionByDownStream);

    System.out.println(":::::::Collectors.summingInt()::::::::");

    List<Product> products = TestData.getProducts();
    Integer summingInt = products.stream()
        .collect(Collectors.summingInt(Product::getQuantity));//mapToInt
    System.out.println(summingInt);

    System.out.println(":::::::Collectors.summingDouble()::::::::");

    Double summingDouble = products.stream()
        .collect(Collectors.summingDouble(Product::getPrice));//mapToDouble
    System.out.println(summingDouble);

    System.out.println(":::::::Collectors.summingLong()::::::::");

    Long summingLong = products.stream()
        .collect(Collectors.summingLong(Product::getProductNumber));//mapToLong
    System.out.println(summingLong);

    System.out.println(":::::::Collectors.maxBy()::::::::");
    Optional<Product> maxBy = products.stream()
        .collect(Collectors.maxBy(Comparator.comparing(Product::getPrice)));//max
    System.out.println(maxBy.get());

    System.out.println(":::::::Collectors.minBy()::::::::");
    Optional<Product> minBy = products.stream()
        .collect(Collectors.minBy(Comparator.comparing(Product::getPrice)));//min
    System.out.println(minBy.get());
  }
}
