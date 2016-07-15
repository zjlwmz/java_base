package com.sort;

import org.junit.Test;

/**
 * desc
 *
 * @Author: qianqian.sun
 * @Date: 2016/7/13
 */
public class ChooseSort extends Base {

	@Test
	public void test() {
		Integer[] a = intArray();
		show(a);
		sort(a);
		show(a);
	}

	/**
	 * 选择排序: 遍历无序队列取出最小的 ,放在有序队列后面
	 *
	 * @param array
	 */
	@Override
	public void sort(Comparable[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			// 从a[i]...a[n-1]中找到最小值和a[i]交换
			for (int j = i + 1; j < n; j++) {
				if (less(array[j], array[i])) swap(array, j, i);
			}
		}
	}
}
