package com.interview.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class User {
    private String userName;
    private List<Integer> phoneNumbers;
}
