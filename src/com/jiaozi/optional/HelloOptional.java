package com.jiaozi.optional;

import com.jiaozi.compare.Apple;
import com.sun.deploy.util.StringUtils;

import java.net.SocketTimeoutException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Description: optional测试
 * @Author: xiam
 * @Create: 2019-08-09
 **/
public class HelloOptional {
    public static void main(String[] args) {

        //Optional<Apple> appleOptional = Optional.empty();
        //System.out.println(appleOptional);

        /****************************Optional.empty**************************/
        Optional<Insurance> insuranceOptional = Optional.empty();
        //System.out.println(insuranceOptional.get());
        /****************************Optional.of**************************/
        Optional<Insurance> insuranceOptional1 = Optional.of(new Insurance());
        System.out.println(insuranceOptional1.get());

        /****************************Optional.ofNullable**************************/
        Optional<Insurance> insuranceOptional2 = Optional.ofNullable(new Insurance());
        System.out.println(insuranceOptional2.get());

        Optional<Insurance> insuranceOptional3 = Optional.ofNullable(null);
        // System.out.println(insuranceOptional3.get());


        // 方法 isPresent
        System.out.println(insuranceOptional2.isPresent());
        System.out.println(insuranceOptional3.isPresent());

        // 方法 ifPresent consume
        insuranceOptional2.ifPresent(insurance -> System.out.println(insurance.getName()));

        // orElse
        insuranceOptional3.orElse(new Insurance());
        System.out.println( insuranceOptional3.orElse(new Insurance()));

        // orElseGet Supply
        Insurance insurance = insuranceOptional3.orElseGet(() -> new Insurance());
        System.out.println(insurance);

        // orElseThrow Supply
       // System.out.println(insuranceOptional3.orElseThrow(()->new NullPointerException()));

        // map
        System.out.println(insuranceOptional3.map(insurance1 -> insurance1.getName()).orElse("hello"));
        System.out.println(insuranceOptional3.map(insurance1 -> insurance1.getName()).orElseGet(()->"hello"));

        // flatMap

        System.out.println(getRandomRate());
        String pid = "";
        String[] arr = pid.split(",");
        System.out.println("11"+arr[0] + "11");

        // HashSet<String> ipNameSet = new HashSet<>();

        // String ipStr =  StringUtils.join(ipNameSet.toArray(),",");


    }

    public static String getRandomRate(){
        Random random = new Random();
        int i=random.nextInt(1000)+9000;//生成从0-指定数（不包括指定数）的整数
        String a= (double)i /100 +"";
        return a;


    }

//    public static void main(String[] args) {
//        System.out.println(getRandomRate());
//    }
}
