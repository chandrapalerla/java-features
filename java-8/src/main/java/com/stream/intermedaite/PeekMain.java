package com.stream.intermedaite;

import com.interview.bean.EmployeeBean;
import com.utility.TestDataUtility;

public class PeekMain {

  public static void main(String[] args) {
    TestDataUtility.getEmployeeData()
        .stream()
        .filter(emp -> emp.getDept().equalsIgnoreCase("it"))
        .peek(System.out::println)
        .map(EmployeeBean::getEmailId)
        .forEach(System.out::println);
  }
}
