package com.example.InternJava.week2.Thread;

public class ThreadSleep extends Thread{
    public void run(){
        for (int i = 0; i < 11 ; i++) {
            if(Thread.currentThread().getPriority() > 5){
                try {
                    Thread.currentThread().join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSleep m1 = new ThreadSleep();
        ThreadSleep m2 = new ThreadSleep();
        m1.start();
        m1.setPriority(MIN_PRIORITY);
        m2.start();
        m2.setPriority(MAX_PRIORITY);
    }
}
