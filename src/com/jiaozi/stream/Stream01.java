package com.jiaozi.stream;

import java.io.*;
import java.util.stream.Stream;

/**
 * @Description: 数据流
 * @Author: xiam
 * @Create: 2019-09-09
 **/
public class Stream01 {
    public static void main(String[] args) {
        Stream.iterate(0,i -> i+2)
                .limit(20)
                .forEach(System.out::println);

    }
}
