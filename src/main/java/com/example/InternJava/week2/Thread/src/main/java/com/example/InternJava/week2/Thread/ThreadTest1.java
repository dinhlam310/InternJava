package com.example.InternJava.week2.Thread;

public class ThreadTest1 extends Thread{
    public void run(){
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        ThreadTest1 test1 = new ThreadTest1();
        test1.start();
    }
}
