package com.methodreference;

import com.interview.bean.EmployeeBean;
import com.utility.TestDataUtility;
import java.util.List;

public class MethodReferenceMain {

  public static void main(String[] args) {
    List<EmployeeBean> employeeData = TestDataUtility.getEmployeeData();

    System.out.println(" before java:::8 ");
    for (EmployeeBean employeeBean : employeeData) {
      System.out.println(employeeBean.getEmpName());
    }

    System.out.println("after java 8 ");
    employeeData.forEach(employeeBean -> {
      System.out.println(employeeBean.getEmpName());
    });
    System.out.println("Method reference");
    List<String> namesList = TestDataUtility.getNamesList();
    namesList.forEach(System.out::println);

    employeeData.stream().map(EmployeeBean::getEmpName).forEach(System.out::println);
  }
}
