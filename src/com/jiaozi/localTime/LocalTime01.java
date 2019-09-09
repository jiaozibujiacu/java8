package com.jiaozi.localTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: 时间类
 * @Author: xiam
 * @Create: 2019-09-09
 **/
public class LocalTime01 {
    public static void main(String[] args) {
        // 获取当前天
        LocalDate today = LocalDate.now();

        System.out.println(today);
        System.out.println("年份："+today.getYear());
        System.out.println("月份："+today.getMonthValue());
        System.out.println("日期号："+today.getDayOfMonth());

        // 获取小时
        LocalTime todayTime = LocalTime.now();
        System.out.println(todayTime);

        // 获取当前天+小时
        LocalDateTime todayAndTime = LocalDateTime.now();
        todayAndTime.minusHours(2);
        System.out.println(todayAndTime.minusHours(2));

        // 字符串转为LocalDateTime
        String timeNo = "2019-09-02 12:23:17";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.parse(timeNo,formatter);
        System.out.println(timeNo+"......"+time);

        // 时间转字符串
        String time02 = time.format(formatter);
        System.out.println(time+"......"+time02);

        LocalDate start = LocalDate.now();

        LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());

        List<LocalDate> dates = Stream.iterate(start, date -> date.plusDays(1))
                .limit(ChronoUnit.DAYS.between(start, end))
                .collect(Collectors.toList());
        System.out.println(dates.size());
        System.out.println(dates);
        // 时间格式化

    }
}
