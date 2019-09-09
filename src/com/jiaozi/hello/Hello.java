package com.jiaozi.hello;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 测试
 * @Author: xiam
 * @Create: 2019-08-05
 **/
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello...");
        System.out.println("hello...");
        Map<String,String> hello = new HashMap<>();
        System.out.println(hello.get("hello"));

        try (
                BufferedInputStream bin = new BufferedInputStream(
                        new FileInputStream(new File("test.txt")));
                BufferedOutputStream bout = new BufferedOutputStream(
                        new FileOutputStream(new File("out.txt")))) {
            int b;
            while ((b = bin.read()) != -1) {
                bout.write(b);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
