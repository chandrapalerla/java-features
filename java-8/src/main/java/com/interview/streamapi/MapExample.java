package com.interview.streamapi;

import com.interview.bean.User;
import com.interview.testdate.TestDataUtility;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<User> userData = TestDataUtility.getUserData();
        List<String> userNames = userData.stream()
                .map(User::getUserName)
                .collect(Collectors.toList());
        System.out.println(userNames);

        List<List<Integer>> phoneNumbers = userData.stream()
                .map(User::getPhoneNumbers)
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
