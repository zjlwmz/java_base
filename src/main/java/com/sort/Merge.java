package com.sort;

import org.junit.Test;

/**
 * desc
 *
 * @Author: qianqian.sun
 * @Date: 2016/7/13
 */
public class Merge extends Base {

	private static Comparable[] aux;

	@Test
	public void test() {
		Integer[] a = intArray();
		aux = new Comparable[a.length];
		show(a);
		sort(a, 0, a.length - 1);
		show(a);
	}

	/**
	 * 归并排序 - 归并操作:将两个有序队列归并为一个有序数组
	 *
	 * @param a
	 * @param low  需要归并段的起始位置
	 * @param mid  需要归并段的中间位置,用于将归并段再分治
	 * @param high 需要归并段的结束位置
	 */
	public void merge(Comparable[] a, int low, int mid, int high) {
		//将a[low]...a[mid] 和 a[mind+1]...a[high]归并
		int i = low, j = mid + 1;
		for (int k = i; k <= high; k++) {
			aux[k] = a[k];
		}
		for (int k = i; k <= high; k++) {
			if (i > mid) { // 左边用尽取右边
				a[k] = aux[j++];
			} else if (j > high) { // 右边用尽取左边
				a[k] = aux[i++];
			} else if (less(aux[i], aux[j])) { // 左右都有取小的
				a[k] = aux[i++];
			} else {
				a[k] = aux[j++];
			}
		}
	}

	/**
	 * 归并排序 - 排序操作 , 将数组分两半进行递归归并
	 *
	 * @param a
	 */
	public void sort(Comparable[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = low + (high - low) / 2;
		sort(a, low, mid);
		sort(a, mid + 1, high);
		merge(a, low, mid, high);
	}
}
