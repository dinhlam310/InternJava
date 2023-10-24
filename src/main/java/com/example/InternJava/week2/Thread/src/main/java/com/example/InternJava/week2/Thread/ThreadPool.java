package com.example.InternJava.week2.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        // Tạo một Thread Pool với kích thước là 3
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        // Gửi các tác vụ (Runnable) đến Thread Pool để xử lý
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            threadPool.execute(() -> {
                System.out.println("Task " + taskNumber + " processed by " + Thread.currentThread().getName());
                // Simulate some task execution time
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskNumber + " completed by " + Thread.currentThread().getName());
            });
        }

        // Đóng Thread Pool sau khi hoàn thành các tác vụ
        threadPool.shutdown();
    }
}
