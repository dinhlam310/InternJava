package com.example.InternJava.week2.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer maxx = list.stream().max(Integer::compare).get();
        Integer minn = list.stream().min(Integer::compare).get();
        System.out.println("Max: "+maxx+"\nMin: "+minn);

        List<Integer> list1 = Arrays.asList(1,2,2,2,2,3,4,5);
        list1.stream().distinct().filter(i-> i<4).limit(2).map(i -> i*i).forEach(System.out::println);
        System.out.println("===============");

        String result = list.parallelStream().map(String::valueOf).collect(Collectors.joining(", ")); // Nối các chuỗi lại với dấu phẩy và khoảng trắng

        System.out.println(result);
    }

}
