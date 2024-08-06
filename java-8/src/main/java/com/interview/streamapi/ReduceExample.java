package com.interview.streamapi;



import com.bean.EmployeeBean;
import com.utility.TestDataUtility;
import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<EmployeeBean> employeeData = TestDataUtility.getEmployeeData();
        double salarySum = employeeData.stream()
                .filter(employeeBean -> employeeBean.getDept().equalsIgnoreCase("it"))
                .map(EmployeeBean::getSalary)
                .mapToDouble(salary -> salary).sum();
        System.out.println(salarySum);

        Double reduce = employeeData.stream()
                .filter(employeeBean -> employeeBean.getDept().equalsIgnoreCase("it"))
                .map(EmployeeBean::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println(reduce);

        Double doubleValue = employeeData.stream()
                .filter(employeeBean -> employeeBean.getDept().equalsIgnoreCase("it"))
                .map(EmployeeBean::getSalary)
                .mapToDouble(Double::floatValue)
                .average().getAsDouble();
        System.out.println(doubleValue);

        String[] strings = {"a", "b", "c", "d", "e", ""};
        String str = Arrays.stream(strings)
                .reduce("", (a, b) -> {
                    if (!"".equals(a)) {
                        return a + "|" + b;
                    } else {
                        return b;
                    }
                });
        System.out.println(str);

        Long it = TestDataUtility.getEmployeeData()
                .stream()
                .filter(employeeBean -> employeeBean.getDept().equalsIgnoreCase("it"))
                .map(EmployeeBean::getEmpName)
                .count();
        System.out.println(it);
    }
}
