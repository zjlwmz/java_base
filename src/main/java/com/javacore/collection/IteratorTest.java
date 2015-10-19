package com.javacore.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/25
 * @Description:
 * @CodeReviewer:
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int i =  it.next();
            System.out.print(i + ",");
            if (i % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
