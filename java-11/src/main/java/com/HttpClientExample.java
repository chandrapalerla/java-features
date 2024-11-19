package com;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientExample {

    public static void main(String[] args) {
        try {
            // Create HttpClient
            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .connectTimeout(Duration.ofSeconds(10))
                    .build();

            // Create HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                    .GET()
                    .build();

            // Send HttpRequest and get HttpResponse
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print response status code and body
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
