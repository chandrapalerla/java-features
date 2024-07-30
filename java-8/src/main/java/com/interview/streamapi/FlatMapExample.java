package com.interview.streamapi;

import com.interview.bean.User;
import com.utility.TestDataUtility;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {

        List<User> userData = TestDataUtility.getUserData();

        List<Integer> phoneNumbers = userData
                .stream()
                .flatMap(user -> user.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);

        Map<String, Integer> userNameAndPhoneNumbers = userData
                .stream()
                .collect(Collectors.toMap(User::getUserName, user -> user.getPhoneNumbers().size(), (l1, l2) -> l1));
        System.out.println(userNameAndPhoneNumbers);

        Long collect = userData
                .stream()
                .mapToLong(user -> user.getPhoneNumbers().size()).sum();
        System.out.println(collect);
    }
}
