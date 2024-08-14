package com.stream.terminated;

import com.bean.EmployeeBean;
import com.bean.User;
import com.utility.TestData;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class ReduceMain {

  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4};
    String[] languages = {"Java", "Python", "Js", "C", "C++"};

    OptionalInt reduce = Arrays.stream(numbers)
        .reduce((a, b) -> a + b);
    System.out.println(reduce);

    int reduce1 = Arrays.stream(numbers)
        .reduce(100, (a, b) -> a * b);
    System.out.println(reduce1);

    Arrays.stream(languages).reduce((s1, s2) -> s1 + "|" + s2).ifPresent(System.out::println);

    String reduce2 = Arrays.stream(languages)
        .reduce("program Langaues:::::", (s1, s2) -> s1 + "|" + s2);
    System.out.println(reduce2);

    Optional<String> reduce3 = TestData.getUserData().stream()
        .map(User::getUserName)
        .reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2);
    System.out.println(reduce3.get());

    Optional<Double> reduce4 = TestData.getEmployeeData()
        .stream()
        .map(EmployeeBean::getSalary)
        .reduce((sal1, sal2) -> sal1 > sal2 ? sal1 : sal2);
    System.out.println(reduce4.get());

  }
}
