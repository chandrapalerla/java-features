package com.stream.intermedaite;

import com.interview.bean.EmployeeBean;
import com.utility.TestData;
import com.utility.TestDataUtility;

public class MapMain {

  public static void main(String[] args) {
    TestData.getAlphabet()
        .stream()
        .filter(str -> str.length() > 5)
        .map(s -> s + " abc")
        .forEach(System.out::println);

    TestDataUtility.getEmployeeData()
        .stream()
        .filter(emp -> emp.getDept().equalsIgnoreCase("it"))
        .map(EmployeeBean::getEmailId)
        .forEach(System.out::println);
  }
}
