package com.utility;


import com.interview.bean.EmployeeBean;
import com.interview.bean.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDataUtility {

  public static List<EmployeeBean> getEmployeeData() {
    List<EmployeeBean> employeeBeanList = new ArrayList<>();

    employeeBeanList.add(new EmployeeBean(10, "pavel", "it", 56776.67, "pavel@gmail.com"));
    employeeBeanList.add(new EmployeeBean(11, "mikalai", "it", 25879.67, "mikalai@gmail.com"));
    employeeBeanList.add(new EmployeeBean(12, "donald", "it", 85000.67, "donald@gmail.com"));
    employeeBeanList.add(new EmployeeBean(13, "onac", "centrl", 25879.67, "onac@yahoo.com"));
    employeeBeanList.add(new EmployeeBean(14, "ragav", "central", 72500.67, "ragav@yahoo.com"));
    employeeBeanList.add(new EmployeeBean(15, "maset", "non-it", 76700.67, "maset@yahoo.com"));
    employeeBeanList.add(new EmployeeBean(16, "hancy", "it", 55000, "hancy@gmail.com"));

    return employeeBeanList;

  }

  public static List<String> getNamesList() {
    List<String> names = new ArrayList<>();

    names.add("donald");
    names.add("chandu");
    names.add("pavel");
    names.add("kaushik");

    return names;
  }

  public static List<Integer> getNumberList() {
    List<Integer> numbers = new ArrayList<>();

    numbers.add(12);
    numbers.add(6);
    numbers.add(14);
    numbers.add(5);

    return numbers;
  }

  public static Map<Integer, String> getNamesMap() {
    Map<Integer, String> integerStringMap = new HashMap<>();

    integerStringMap.put(1, "donald");
    integerStringMap.put(2, "chandu");
    integerStringMap.put(3, "pavel");

    return integerStringMap;
  }

  public static Map<EmployeeBean, Integer> getEmployeeMapData() {

    Map<EmployeeBean, Integer> employeeBeanIntegerMap = new HashMap<>();
    employeeBeanIntegerMap.put(new EmployeeBean(10, "donals", "It", 45000, "donals@gmail.com"), 10);
    employeeBeanIntegerMap.put(new EmployeeBean(43, "maike", "It", 56000, "maike@yahoo.com"), 11);
    employeeBeanIntegerMap.put(new EmployeeBean(56, "roch", "Admin", 15000, "roch@gmail.com"), 11);
    employeeBeanIntegerMap.put(new EmployeeBean(5, "surya", "admin", 25000, "surya@yahoo.com"), 12);
    employeeBeanIntegerMap.put(new EmployeeBean(60, "umran", "Staff", 65000, "umran@gmail.com"),
        13);

    return employeeBeanIntegerMap;
  }

  public static List<User> getUserData() {
    List<User> users = new ArrayList<>();

    users.add(new User("devil", Arrays.asList(9645565, 897678, 657677878)));
    users.add(new User("kapil", Arrays.asList(656565656, 787787878, 656565656, 787787878)));
    users.add(new User("maxim", Arrays.asList(878765454, 676765, 45456576, 565676778)));

    return users;
  }

  public static List<List<Integer>> getPhoneNumbers() {

    List<Integer> list1 = Arrays.asList(9645565, 897678, 657677878);
    List<Integer> list = Arrays.asList(656565656, 787787878);
    List<Integer> list2 = Arrays.asList(878765454, 676765, 45456576, 565676778);

    return List.of(list1, list, list2);

  }
}
