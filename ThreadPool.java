package com.example.InternJava.week2.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        // Tạo một Thread Pool với kích thước là 3
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        // Gửi các tác vụ (Runnable) đến Thread Pool để xử lý
        for (int i = 1; i <= 5; i++) {
            String name ="My name is Lam and I";
            threadPool.execute(() -> {
                System.out.println(name + " processed by " + Thread.currentThread().getName());
                // Simulate some task execution time
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + name + " completed by " + Thread.currentThread().getName());
            });
        }

        threadPool.shutdown();
    }
}
