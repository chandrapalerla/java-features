package com;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class AsyncHttpClientExample {

    public static void main(String[] args) {
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

        // Send HttpRequest asynchronously and get CompletableFuture<HttpResponse<String>>
        CompletableFuture<HttpResponse<String>> responseFuture = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        // Handle the CompletableFuture
        responseFuture.thenApply(HttpResponse::body)
                .thenAccept(body -> {
                    System.out.println("Response body: " + body);
                })
                .join(); // Wait for the future to complete
    }
}
