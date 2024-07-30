package com.lambdas;

import java.util.function.Function;

public class FunctionMain {

  public static void main(String[] args) {
    Function<String,Integer>  function = (str)-> 12;
    System.out.println(function.apply("chandu"));
  }

}
