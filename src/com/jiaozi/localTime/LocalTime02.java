package com.jiaozi.localTime;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @Description: dateTime
 * @Author: xiam
 * @Create: 2019-09-09
 **/
public class LocalTime02 {
    public static void main(String[] args) {

        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nowStr = now.format(formatter);
        System.out.println(nowStr);

        // LocalDateTime end = now.minusHours(1);
        LocalDateTime end = now.minusHours(50);
        System.out.println(end.format(formatter));

        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // 当前两个小时
        LocalDateTime timeDate = LocalDateTime.now().minusHours(2);
        String prehour = timeDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH"));
        System.out.println(prehour);

        // 循环遍历
        long distance = ChronoUnit.HOURS.between(end, now);
        Stream.iterate(end,d->d.plusHours(1)).limit(distance+1).forEach(System.out::println);
        // Stream.iterate(end,d->d.plusHours(1)).limit(distance+1).forEach(System.out::println);
        System.out.println(distance);
        Stream<String> stream = Stream.of("xiam","jiaozi","jiaozibujiacu");
        stream.limit(2).forEach(System.out::println);


    }
}
