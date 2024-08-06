package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import lombok.Getter;
import lombok.Setter;


public class User {

    public User(String userName, List<Integer> phoneNumbers) {
        this.userName = userName;
        this.phoneNumbers = phoneNumbers;
    }

    private String userName;
    private List<Integer> phoneNumbers;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
