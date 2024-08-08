package com.stream.terminated;

import com.utility.TestData;

public class CountMain {

  public static void main(String[] args) {
    long count = TestData.getUserData()
        .stream()
        .filter(user -> user.getUserName().length() > 5)
        .count();
    System.out.println(count);

  }
}
