package com.lambdas;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {

  public static void main(String[] args) {
    Consumer<Integer> consumer = (a)-> System.out.println("test message "+a);
    consumer.accept(10);

    BiConsumer<Integer,Integer> biConsumer = (i,i1)->{
      if(i>i1){
        System.out.println("i is bigger than of i1");
      }else{
        System.out.println("i is smaller than i1");
      }
    };
    biConsumer.accept(10,20);
  }
}
