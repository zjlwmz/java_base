package com.sort;

/**
 * 二叉堆实现优先队列
 *
 * @Author: qianqian.sun
 * @Date: 2016/7/20
 */
public class MaxPQ<Key extends Comparable<Key>> {
	private Key[] pq;
	/**
	 * 堆大小
	 */
	private int N = 0;

	private boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}

	private void swap(int i, int j) {
		Key t = pq[i];
		pq[i] = pq[j];
		pq[j] = t;
	}

	/**
	 * 数值大的上浮
	 *
	 * @param k
	 */
	private void swim(int k) {
		while (k > 1 && less(k / 2, k)) {
			swap(k / 2, k);
			k = k / 2;
		}
	}

	/**
	 * 数值小的下沉
	 *
	 * @param k
	 */
	private void sink(int k) {
		while (2 * k <= N) {
			int j = 2 * k;
			// 比较子节点左右叶子节点,指针移向大的
			if (j < N & less(j, j + 1)) {
				j++;
			}
			// 如果数值比较小,中断
			if (!less(k, j)) {
				break;
			}
			// 数值比较大 , 交换 , 轮回
			swap(k, j);
			k = j;
		}
	}
}
