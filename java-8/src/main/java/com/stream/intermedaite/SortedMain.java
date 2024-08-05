package com.stream.intermedaite;

import com.interview.bean.EmployeeBean;
import com.utility.TestDataUtility;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMain {

  public static void main(String[] args) {
//    List<Integer> integers = List.of(7, 4, 8, 1, 3);
//    integers.stream().sorted().forEach(System.out::println);

    Comparator<EmployeeBean> employeeBeanComparator = (o1, o2) -> {
      if (o1.getEmpName().length() < o2.getEmpName().length()) {
        return +1;
      } else if (o1.getEmpName().length() > o2.getEmpName().length()) {
        return -1;
      }
      return 0;
    };

    List<EmployeeBean> employees = TestDataUtility.getEmployeeData();
    employees.stream()
        .sorted(employeeBeanComparator)
        .forEach(System.out::println);

    List<EmployeeBean> employees1 = TestDataUtility.getEmployeeData();
    employees1.stream()
        .sorted(Comparator.comparing(EmployeeBean::getSalary).thenComparing(employeeBeanComparator))
        .collect(Collectors.toSet());
  }
}