package com;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Collections;
import java.util.Map;

public class ZipFileSystemExample {
    public static void main(String[] args) {
        // Path to the ZIP file
        Path zipPath = Paths.get("example.zip");

        // URI for the ZIP file system
        URI uri = URI.create("jar:" + zipPath.toUri());

        // Environment map for creating the file system
        Map<String, String> env = Collections.singletonMap("create", "true");

        // Create the file system and interact with it
        try (FileSystem zipFileSystem = FileSystems.newFileSystem(uri, env)) {
            // Define the path inside the ZIP file
            Path pathInZipFile = zipFileSystem.getPath("/example.txt");

            // Create a file in the ZIP file system
            Files.write(pathInZipFile, "Hello, ZIP file system!".getBytes());

            // List the contents of the ZIP file system
            Files.walk(zipFileSystem.getPath("/"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
