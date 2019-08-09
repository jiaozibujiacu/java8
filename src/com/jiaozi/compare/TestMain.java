package com.jiaozi.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2019-08-07
 **/
public class TestMain {
    public static void main(String[] args) {
        // 比较器comparator
        Apple a1 = new Apple(20,"red");
        Apple b1 = new Apple(50,"red");
        Apple c1 = new Apple(40,"red");
        List<Apple> appleList = new ArrayList<>();
        appleList.add(a1);
        appleList.add(b1);
        appleList.add(c1);
        // 排序
        // Collections.sort(appleList,new AppleComparator());
        Collections.sort(appleList,(Apple o1,Apple o2) -> o1.getWeight().compareTo(o2.getWeight()));
        System.out.println(appleList);

        // 比较comparable
        Apple1 a2 = new Apple1(20,"red");
        Apple1 b2 = new Apple1(50,"red");
        Apple1 c2 = new Apple1(40,"red");
        List<Apple1> apple1List = new ArrayList<>();
        apple1List.add(a2);
        apple1List.add(b2);
        apple1List.add(c2);
        // 排序
        Collections.sort(apple1List);
        System.out.println(apple1List);

    }
}
