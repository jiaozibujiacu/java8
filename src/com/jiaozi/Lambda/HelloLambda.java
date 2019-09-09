package com.jiaozi.Lambda;

import com.jiaozi.compare.Apple;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;

/**
 * @Description: lamdba表达式测试
 * @Author: xiam
 * @Create: 2019-08-07
 **/
public class HelloLambda {

    public static String getAppleColor(Function<Apple,String> appleFunction,Apple apple){
        return appleFunction.apply(apple);
    }


    public static void main(String[] args) {
        // Comparable
        Integer a = 8;
        Integer b = 9;
        System.out.println(a.compareTo(9));
        Apple c = new Apple(26,"red");
        String str = getAppleColor(apple -> apple.getColor(),c);
        System.out.println(str);
        // Collections
        // Comparator
        // System.out.println();


    }
}
