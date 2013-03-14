package org.buzheng.study.algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 希尔排序是对直接插入排序的改进，按增量将向列划分为几列，
 * 对每列进行直接插入排序。 然后按一定规则缩小增量，再排序， 直至增量为1。
 * 
 */
public class ShellSort {
	
	public void sort(int[] a) {
		int n = a.length / 2;
		
		while (n >= 1) {
			System.out.println("n = " + n);
			this.sort(a, n);
			System.out.println(Arrays.toString(a));
			n = n / 2;
		}
	}

	public void sort(int[] a, int n) {
		int temp;
		for (int i = n; i < a.length; i++) {
			int j = i;
			while (j - n >= 0) {
				if (a[j] < a[j - n]) {
					temp = a[j];
					a[j] = a[j - n];
					a[j - n] = temp;
				}
				j = j - n;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {13, 14, 94, 33, 82, 25, 59, 94, 65, 23, 45, 27, 73, 25, 39, 10};
		System.out.println(Arrays.toString(a));
		new ShellSort().sort(a);
		System.out.println(Arrays.toString(a));
	}

}
