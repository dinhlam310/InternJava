package com.example.InternJava.week2.ThreadNew.Thread;

public class ThreadTest2 implements Runnable{
    public void run(){
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        ThreadTest2 m1 = new ThreadTest2();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
