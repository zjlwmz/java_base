package com.sort;

import org.apache.commons.lang3.RandomUtils;

/**
 * desc
 *
 * @Author: qianqian.sun
 * @Date: 2016/7/13
 */
public abstract class Base {
	public abstract void sort(Comparable[] array);

	public static Integer[] intArray() {
		Integer[] a = new Integer[30];
		for (int i = 0; i < a.length; i++) {
			a[i] = RandomUtils.nextInt(0, 100);
		}
		return a;
	}

	public static void show(Comparable[] objects) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < objects.length; i++) {
			sb.append(objects[i]).append(",");
		}
		System.out.println(sb.toString());
	}

	public static void swap(Comparable[] array, int a, int b) {
		Comparable c = array[a];
		array[a] = array[b];
		array[b] = c;
	}

	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
}
