package com.stream.terminated;

import com.bean.User;
import com.utility.TestData;
import java.util.Optional;

public class FindFirstAndAnyMain {

  public static void main(String[] args) {
    Optional<User> first = TestData.getUserData()
        .stream()
        .findFirst();
    System.out.println(first.get());

    Optional<User> any = TestData.getUserData()
        .stream()
        .findAny();
    System.out.println(any.get());


  }
}
