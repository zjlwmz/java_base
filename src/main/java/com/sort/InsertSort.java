package com.sort;

import org.junit.Test;

/**
 * desc
 *
 * @Author: qianqian.sun
 * @Date: 2016/7/13
 */
public class InsertSort extends Base {

	@Test
	public void test() {
		Integer[] a = intArray();
		show(a);
		sort(a);
		show(a);
	}

	/**
	 * 插入排序: 从无序的序列中取出一个,插入到有序的序列中
	 *
	 * @param array
	 */
	public void sort(Comparable[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			int j = i - 1;// a[i] 插入到 a[0]...a[i-1]
			while (j >= 0 && less(array[j + 1], array[j])) {
				swap(array, j + 1, j);
				j--;
			}
		}
	}
}
