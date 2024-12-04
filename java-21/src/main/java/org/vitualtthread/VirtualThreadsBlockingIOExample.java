package org.vitualtthread;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executors;

public class VirtualThreadsBlockingIOExample {
    public static void main(String[] args) {
        try (var executor = Executors.newThreadPerTaskExecutor(Thread.ofVirtual().factory())) {
            executor.submit(() -> {
                try {
                    URL url = new URL("https://example.com");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    try (var inputStream = conn.getInputStream()) {
                        System.out.println("Response code: " + conn.getResponseCode());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
