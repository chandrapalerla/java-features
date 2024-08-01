package com.interview.streamapi;



import com.interview.bean.EmployeeBean;
import com.utility.TestDataUtility;
import java.util.List;

public class EmployeeFilterDemo {
    public static void main(String[] args) {
        List<EmployeeBean> employeeData = TestDataUtility.getEmployeeData();
        employeeData.stream()
                .filter(emp -> emp.getSalary() > 25000)
                .map(EmployeeBean::getEmpName)
                .forEach(System.out::println);

    }
}
