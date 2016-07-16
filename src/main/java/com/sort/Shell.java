package com.sort;

import org.junit.Test;

/**
 * desc
 *
 * @Author: qianqian.sun
 * @Date: 2016/7/16
 */
public class Shell extends Base {
	@Test
	public void test() {
		Integer[] a = intArray();
		show(a);
		sort(a);
		show(a);
	}

	/**
	 * 希尔排序: 按步长分组 , 组间插入排序 ,逐渐缩小步长为1
	 *
	 * @param array
	 */
	public void sort(Comparable[] array) {
		int N = array.length;
		int h = 1;
		// 计算出步长序列 , 也可以储存到数组中
		while (h < N / 3) {
			h = h * 3 + 1;
		}
		while (h >= 1) {
			for (int i = h; i < N; i++) {
				//将a[i]插入到a[i-h],a[i-2*h]..中
				for (int j = i; j >= h && less(array[j], array[j - h]); j = j - h) {
					swap(array, j, j - h);
				}
			}
			h = h / 3;
		}
	}
}
