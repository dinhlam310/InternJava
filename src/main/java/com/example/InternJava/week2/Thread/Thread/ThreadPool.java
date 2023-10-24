package com.example.InternJava.week2.Thread.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            String name = "My name is Lam ,";
            threadPool.execute(() -> {
                System.out.println(name + " processed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + " completed by " + Thread.currentThread().getName());
            });
        }

        threadPool.shutdown();
    }
}
