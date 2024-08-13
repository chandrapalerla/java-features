package com.interview;

import com.bean.EmployeeBean;
import com.utility.TestData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeProblems {

  public static void main(String[] args) {

    List<EmployeeBean> employees = TestData.getEmployeeData();

//    Problem 1: Department-wise Employee Count
    Map<String, Long> deptCount = employees
            .stream()
            .collect(Collectors.groupingBy(EmployeeBean::getDept, Collectors.counting()));
    System.out.println("deptCount:::::::" + deptCount);
//    Problem 2: Average Salary by Department
    Map<String, Double> deptAverageSalary = employees
            .stream()
            .collect(Collectors.groupingBy(EmployeeBean::getDept, Collectors.averagingDouble(EmployeeBean::getSalary)));
    System.out.println("deptAverageSalary:::::" + deptAverageSalary);

//    Problem 3: Group Employees by Department and List Their Names
    Map<String, List<String>> deptAndNames = employees
            .stream()
            .collect(Collectors.groupingBy(EmployeeBean::getDept,
                    Collectors.collectingAndThen(Collectors.mapping(EmployeeBean::getEmpName,
                            Collectors.toList()), emp -> emp)));
    System.out.println("deptAndNames:::::" + deptAndNames);
//    Problem 4: Employee with the Highest Salary in Each Department
    Map<String, Double> maxSalaryMap = employees.stream()
            .collect(Collectors.groupingBy(EmployeeBean::getDept,
                    Collectors.collectingAndThen(Collectors.maxBy(
                                    Comparator.comparingDouble(EmployeeBean::getSalary)),
                            emp -> emp.get().getSalary())));
    System.out.println("maxSalaryMap::::" + maxSalaryMap);
//    Problem 5: Total Salary by Department
    Map<String, Double> deptAndTotalSalary = employees
            .stream()
            .collect(Collectors.groupingBy(EmployeeBean::getDept, Collectors.summingDouble(EmployeeBean::getSalary)));
    System.out.println("deptAndTotalSalary::::::" + deptAndTotalSalary);
//    Problem 6: Employees Grouped by First Letter of Their Name
//    Problem 8: Partition Employees by Salary Threshold
//    Problem 9: Count Employees by Department and Role
//    Problem 10: List of Departments with No Employees
//    Problem 11: Concatenate Employee Names by Department
//    Problem 12: Top N Highest Paid Employees by Department
//    Problem 13: Average Tenure by Department
//    Problem 14: Sum of Salaries of Employees with Specific Roles
//    Problem 15: List of Employees Not in Any Department
//    Problem 16: Group Employees by Department and Count Each Role
//    Problem 17: Department-wise Employee Salary Statistics
//    Problem 18: Find Departments with All Employees Earning Above a Certain Salary
//    Problem 19: Group Employees by Department and List Their Roles
//    Problem 20: Map of Employees Grouped by Department and Sorted by Salary
//
//    reduce Method Exmaples:
//    Problem 1: Sum of All Salaries
//    Problem 2: Longest Employee Name
//    Problem 3: Highest Salary
//    Problem 4: Concatenate All Employee Names
//    Problem 5: Total Number of Characters in All Employee Names
//    Problem 6: Employee with the Highest Salary
//    Problem 7: Average Salary Using reduce
//    Problem 8: Employee with the Lowest Salary
//    Problem 9: Total Tenure of All Employees
//    Problem 10: Department with the Longest Name
//    Problem 11: Product of All Salaries
//    Problem 12: Employee with the Shortest Name
//    Problem 13: Count Employees Earning Above a Certain Salary
//    Problem 14: Combine All Employee IDs into a Single List
//    Problem 15: Find the Department with the Most Employees
//    Problem 16: Sum of Salaries of Employees in a Specific Department
//    Problem 17: Difference Between Highest and Lowest Salaries
//    Problem 18: Employee with the Most Tenure
//    Problem 19: Concatenate Employee Names by Department
//    Problem 20: Count of Employees with Tenure Above a Certain Number of Years

    String str = "aaabbaanjkkllaajjaaabbnj";
    String collect = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    System.out.println(collect);

  }
}
