package com.sqq.collection7;

import java.util.EnumSet;

/**
 * @Author: sunqianqian
 * @Description:
 * @CodeReviewer:
 */
enum Season {
    SPRING,SUMMER,FALL,WINTER
}
public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet enumSet1 = EnumSet.allOf(Season.class);
        System.out.println(enumSet1);
        EnumSet enumSet2 = EnumSet.noneOf(Season.class);
        System.out.println(enumSet2);
        enumSet2.add(Season.SPRING);
        enumSet2.add(Season.WINTER);

        EnumSet enumSet3 = EnumSet.of(Season.WINTER, Season.FALL);
    }
}
