package com.jiaozi.compare;

import java.util.Comparator;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2019-08-07
 **/
public class AppleComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }


}
