package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesReadingWriting {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Git-hub\\java-features\\java-11\\src\\main\\resources\\sample.txt");
        System.out.println(path);
        Files.writeString(path,"kaushik");
        String s = Files.readString(path);
        System.out.println(s);

    }
}
