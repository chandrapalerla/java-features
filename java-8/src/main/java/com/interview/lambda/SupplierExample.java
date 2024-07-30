package com.interview.lambda;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "System.out.println";
        System.out.println(stringSupplier.get());

        String[] names = {"chandu", "komlai", "kaushik"};
        String name1 = Arrays.stream(names)
                .filter(name -> name.startsWith("s"))
                .findFirst()
                .orElseGet(() -> "name is not found");
        System.out.println(name1);
    }
}
