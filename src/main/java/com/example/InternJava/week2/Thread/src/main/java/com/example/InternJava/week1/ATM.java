package com.example.InternJava.week1;

import java.util.Scanner;

public class ATM {
    // Ex : have 2000 x 5 note , 500 x10 note , 200x10 note, 100x10 note , max input = 18000
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Withdraw amount : ");
        int amount = sc.nextInt();
        int amount1 = amount;
        int note2000 = 5;
        int note500 =  10;
        int note200 = 10;
        int note100 = 10;
        int count = 0;
//        while(amount >= 2000 && note2000 > 0){
//            amount -= 2000;
//            note2000 -= 1;
//            count += 1;
//            System.out.println("1 note 2000");
//        }
//        while(amount >= 500 && note500 > 0){
//            amount -= 500;
//            note500 -= 1;
//            count += 1;
//            System.out.println("1 note 500");
//        }
//        while(amount >= 200 && note200 > 0){
//            amount -= 200;
//            note200 -= 1;
//            count += 1;
//            System.out.println("1 note 200");
//        }
//        while(amount >= 100 && note100 > 0){
//            amount -= 100;
//            note100 -= 1;
//            count += 1;
//            System.out.println("1 note 100");
//        }
//        note2000 = amount/2000;
//        note500 = amount/500;

        System.out.println("Doi duoc " + count + " to tien.");
        System.out.println("Quy doi so tien " + amount1 + " thanh cac to tien sau: " +
                (5- note2000) + " to 2000, "+ (10-note500) + " to 500, " + (10-note200) + " to 200, " + (10-note100) + " to 100.");
    }
}
