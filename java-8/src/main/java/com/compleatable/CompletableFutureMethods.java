package com.compleatable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
        ┌────────────────┬─────────┬────────┬─────────────────────────────┐
        │     Method     │  Input  │ Output │           Purpose           │
        ├────────────────┼─────────┼────────┼─────────────────────────────┤
        │ thenApply(fn)  │ T       │ U      │ Transform result (like map) │
        ├────────────────┼─────────┼────────┼─────────────────────────────┤
        │ thenAccept(fn) │ T       │ void   │ Consume result, no return   │
        ├────────────────┼─────────┼────────┼─────────────────────────────┤
        │ thenRun(fn)    │ nothing │ void   │ Run after, no input/output  │
        └────────────────┴─────────┴────────┴─────────────────────────────┘*/

public class CompletableFutureMethods {
    static void main() throws ExecutionException, InterruptedException {
        // runs default fork join thread pool
        CompletableFuture future1 = CompletableFuture.runAsync(()-> System.out.println("future1 task"));
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"Future 2 task");

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //run custom thread pool
        CompletableFuture future3 = CompletableFuture.runAsync(()-> System.out.println("future1 task"),executorService);
        CompletableFuture<String> future4 = CompletableFuture.supplyAsync(()->"Future 2 task",executorService);
        executorService.shutdown();

        CompletableFuture.supplyAsync(() -> "  hello world  ")
                .thenApply(s -> s.trim())               // transform → String
                .thenApply(s -> s.toUpperCase())        // transform → String
                .thenApply(s -> "Result: " + s)         // transform → String
                .thenAccept(s -> System.out.println(s)) // consume → void
                .thenRun(() -> System.out.println("Pipeline complete")); // no input
    /*┌─────────────┬────────────┬───────────────────────────────────────┐
  │   Method    │ Execution  │               Use When                │
  ├─────────────┼────────────┼───────────────────────────────────────┤
  │ thenCombine │ Parallel   │ Two independent tasks, merge results  │
  ├─────────────┼────────────┼───────────────────────────────────────┤
  │ thenCompose │ Sequential │ Second task needs first task's result │
  └─────────────┴────────────┴───────────────────────────────────────┘*/
        // thenCombine — both run in PARALLEL, combine when BOTH done
        CompletableFuture<String> thenCombine = future2.thenCombine(future4,(s1,s2)-> s1+" Combining"+s2);
        System.out.println(thenCombine.get());
    }
}
