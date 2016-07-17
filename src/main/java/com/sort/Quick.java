package com.sort;

import org.junit.Test;

/**
 * desc
 *
 * @Author: qianqian.sun
 * @Date: 2016/7/17
 */
public class Quick extends Base {
	@Test
	public void test() {
		Integer[] a = intArray();
		show(a);
//		System.out.println(partition(a, 0, a.length - 1));
//		show(a);
		sort(a, 0, a.length - 1);
		show(a);
	}

	/**
	 * 快速排序 - 分片操作 : 以a[low]的值x为分片值 , 将a[low]...a[high]分为小于等于x和大于等于x两部分,返回中间位置
	 *
	 * @param a
	 * @param low
	 * @param high
	 * @return
	 */
	public int partition(Comparable[] a, int low, int high) {
		Comparable x = a[low];
		int i = low, j = high + 1; // 左右扫描指针
		while (true) {
			// 从前向后找到比x大的
			// 从后向前找到比x小的
			//两者交换
			while (less(x, a[--j])) {
				if (j == low) {
					break;
				}
			}
			while (less(a[++i], x)) {
				if (i == high) {
					break;
				}
			}

			if (i >= j) {
				break;
			}
			swap(a, i, j);
		}
		swap(a, low, j);
		return j;
	}

	public void sort(Comparable[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int j = partition(a, low, high);
		sort(a, low, j - 1);
		sort(a, j + 1, high);
	}

}
