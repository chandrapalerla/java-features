package com.lambdas;

import com.bean.EmployeeBean;

import com.utility.TestData;
import java.util.List;

public class EmployeeSorting {
    public static void main(String[] args) {
        List<EmployeeBean> employeeData = TestData.getEmployeeData();
        employeeData.sort((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));
        System.out.println(employeeData);

    }
}
