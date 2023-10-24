package com.example.InternJava.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Nhập các giá trị số nguyên (nhập chữ cái bất kì để kết thúc):");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println("Danh sách các số nguyên đã nhập:");
        System.out.println(numbers);

        findSecondLargest(numbers);
    }

    public static void findSecondLargest(List<Integer> numbers) {
        if (numbers.size() < 2) {
            System.out.println("List must have at least two elements.");
            return ;
        }

        int largest = Integer.MIN_VALUE; // -2147483648
        int secondLargest = Integer.MIN_VALUE;
        // num : là từng phẩn tử trong List numbers
        for (int num : numbers) {
            if (num > largest) { // nếu phần tử này lớn hơn largest (10 > -2147483648)
                secondLargest = largest; // secondLargest = -2147483648
                largest = num; // largest = 10 , tức là đưa thằng lớn thứ 2 nhận giá trị thằng lớn nhất , còn thằng lớn nhất nhận giá trị cao hơn
            } else if (num > secondLargest && num < largest) { // nếu phẩn từ lớn hơn thằng 2 , nhỏ hơn thằng 1 thì cập nhật thằng 2
                secondLargest = num;
            }
        }

        System.out.println("Số lớn thứ 2 trong dãy đã nhập : " + secondLargest);
    }
}
