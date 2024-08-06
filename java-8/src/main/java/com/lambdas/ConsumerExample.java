package com.lambdas;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (name) -> System.out.println("consummer acctept method  " + name);
        consumer.accept("chandu");
    }
}
