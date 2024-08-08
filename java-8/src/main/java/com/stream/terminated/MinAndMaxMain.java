package com.stream.terminated;

import com.bean.EmployeeBean;
import com.utility.TestData;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxMain {

  public static void main(String[] args) {
    List<EmployeeBean> employeeData = TestData.getEmployeeData();

    employeeData.stream()
        .filter(employeeBean -> employeeBean.getEmpName().equalsIgnoreCase("chandu"))
        .max(Comparator.comparing(EmployeeBean::getSalary)).ifPresent(employeeBean -> {
          System.out.println(employeeBean.getSalary());
        });

    employeeData.stream()
        .min(Comparator.comparing(EmployeeBean::getSalary)).ifPresent(employeeBean -> {
          System.out.println(employeeBean.getSalary());
        });

  }

}
