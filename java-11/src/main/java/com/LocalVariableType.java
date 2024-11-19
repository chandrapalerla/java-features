package com;

import java.util.ArrayList;
import java.util.List;

public class LocalVariableType {
    public static void main(String[] args) {

        //Using normal reference
        List<String> names = new ArrayList<>();
        names.add("test");
        names.add("kaushik");
        names.forEach(System.out::println);

        //Using Var reference
        var namesList = new ArrayList<>();
        namesList.add("test");
        namesList.add("kaushik");
        namesList.forEach(System.out::println);
    }
}
