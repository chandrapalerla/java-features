package com.stream.intermedaite;

import com.bean.EmployeeBean;
import com.utility.TestData;

public class PeekMain {

  public static void main(String[] args) {
    TestData.getEmployeeData()
        .stream()
        .filter(emp -> emp.getDept().equalsIgnoreCase("it"))
        .peek(System.out::println)
        .map(EmployeeBean::getEmailId)
        .forEach(System.out::println);
  }
}
