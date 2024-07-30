package com.interview.lambda;

import com.interview.bean.EmployeeBean;
import com.interview.testdate.TestDataUtility;

import java.util.List;

public class EmployeeSorting {
    public static void main(String[] args) {
        List<EmployeeBean> employeeData = TestDataUtility.getEmployeeData();
        employeeData.sort((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));
        System.out.println(employeeData);

    }
}
