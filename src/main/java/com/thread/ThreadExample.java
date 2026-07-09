package com.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExample {

    // ExecutorService vs new Thread()

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        // new Thread Approach - Every task creates a separate thread.
       /* for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
            }).start();
        }*/

        //ExecutorService - Instead of creating threads repeatedly, it uses a Thread Pool.
     /*   ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 10; i++) {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }

        executor.shutdown();*/

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> future = executor.submit(() -> {
            return 100;
        });

        System.out.println(future.get());

        executor.shutdown();

    }




}
