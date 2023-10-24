package com.example.InternJava.week1;

import java.util.Scanner;

public class HaNoiTower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dia:");
        int n = sc.nextInt();
        solveHanoi(n, 'A', 'C', 'B');

    }

    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        int count = 0;
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveHanoi(n-1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveHanoi(n-1, auxiliary, destination, source);

    }

}
