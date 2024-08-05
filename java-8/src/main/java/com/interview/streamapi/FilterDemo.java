package com.interview.streamapi;

import com.utility.TestDataUtility;
import java.util.List;
import java.util.Map;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> names = TestDataUtility.getNamesList();
        names.stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);

        Map<Integer, String> integerStringMap = TestDataUtility.getNamesMap();
        integerStringMap.entrySet()
                .stream()
                .filter(k -> k.getKey() % 2 == 0)
                .forEach(System.out::println);
    }
}