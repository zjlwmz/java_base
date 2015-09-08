package com.sqq.generic8;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: sunqianqian
 * @Description:
 * @CodeReviewer:
 */
public class GenericTest {
    public void test(List<?> objects) {
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        new GenericTest().test(strings);

    }
}
