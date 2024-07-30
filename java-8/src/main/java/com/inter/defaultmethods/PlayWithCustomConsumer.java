package com.inter.defaultmethods;

public class PlayWithCustomConsumer {

  public static void main(String[] args) {

    CustomConsumer<String> con1 = (str)-> System.out.println(str);

    CustomConsumer<String> con2 = (str1)-> System.out.println(str1);

    CustomConsumer<String> stringCustomConsumer = con1.andThen(con2);
    stringCustomConsumer.accept("chandu");
  }

}
