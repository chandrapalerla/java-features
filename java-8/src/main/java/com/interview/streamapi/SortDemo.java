package com.interview.streamapi;

import com.interview.bean.EmployeeBean;
import com.utility.TestDataUtility;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortDemo {
    public static void main(String[] args) {

        List<Integer> numberList = TestDataUtility.getNumberList();
        //Accending Order
        numberList.stream()
                .sorted().forEach(System.out::println);
        //desending order
        numberList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Comparator<EmployeeBean> employeeBeanComparator = (o1, o2) -> (int) (o2.getSalary() - o1.getSalary());
        List<EmployeeBean> employeeData = TestDataUtility.getEmployeeData();

        employeeData.stream()
                .sorted(employeeBeanComparator)
                .forEach(System.out::println);

        employeeData.stream()
                .sorted(Comparator.comparing(EmployeeBean::getSalary).reversed())
                .forEach(System.out::println);

        Map<Integer, String> namesMap = TestDataUtility.getNamesMap();
        namesMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<EmployeeBean, Integer> employeeMapData = TestDataUtility.getEmployeeMapData();
        employeeMapData.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeeBean::getEmpID)))
                .forEach(System.out::println);

    }
}
