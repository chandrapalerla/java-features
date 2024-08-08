package com.stream.terminated;

import com.utility.TestData;

public class MatchMain {

  public static void main(String[] args) {
    boolean anyMatch = TestData.getEmployeeData()
        .stream()
        .anyMatch(employeeBean -> employeeBean.getDept().equalsIgnoreCase("it"));
    System.out.println(anyMatch);

    boolean allMatch = TestData.getEmployeeData()
        .stream()
        .allMatch(employeeBean -> employeeBean.getDept().equalsIgnoreCase("it"));
    System.out.println(allMatch);

    boolean nonMatch = TestData.getEmployeeData()
        .stream()
        .noneMatch(employeeBean -> employeeBean.getDept().equalsIgnoreCase("i"));
    System.out.println(nonMatch);
  }
}
