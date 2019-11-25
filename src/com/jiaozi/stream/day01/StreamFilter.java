package com.jiaozi.stream.day01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2019-11-25
 **/
public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 9, 6, 7, 6, 5, 8);
        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(toList());
        System.out.println(collect);

        List<Integer> collect1 = list.stream().distinct().collect(toList());
        System.out.println(collect1);

        List<Integer> collect2 = list.stream().skip(4).collect(toList());
        System.out.println(collect2);

        List<Integer> collect3 = list.stream().limit(5).collect(toList());
        System.out.println(collect3);

        List<String> collect4 = list.stream().map(i -> i + "hello").collect(toList());
        System.out.println(collect4);

        String[] str = {"hello","work"};

        Stream<String[]> stream = Arrays.stream(str).map(s -> s.split(""));
        List<String> collect5 = stream.flatMap(Arrays::stream).limit(1).collect(toList());
        System.out.println(collect5);

    }
}
