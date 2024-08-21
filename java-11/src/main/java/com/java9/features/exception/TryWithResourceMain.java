package com.java9.features.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceMain {

  public static void main(String[] args) throws IOException {
    File file = new File(
        "D:\\Git_Source\\java-features\\java-9\\java-11\\src\\main\\resources\\sample.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));

    // Original try-with-resources statement from JDK 7 or 8
    try (BufferedReader reader = br) {
      String st = reader.readLine();
      System.out.println(st);
    }

    // New and improved try-with-resources statement in JDK 9
    try(br)
    {
      String st = br.readLine();
      System.out.println(st);
    }
  }
}
