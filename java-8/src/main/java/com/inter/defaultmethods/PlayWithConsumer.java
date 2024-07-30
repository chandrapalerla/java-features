package com.inter.defaultmethods;

import java.util.function.Consumer;

public class PlayWithConsumer {

  public static void main(String[] args) {
    Consumer<String> consumer = (str)-> System.out.println(str);
    consumer.accept("chandu");

    Consumer<String> consumer1 = consumer.andThen(consumer);
    consumer1.accept("shekar");
  }

}
