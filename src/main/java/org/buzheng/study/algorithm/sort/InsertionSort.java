package org.buzheng.study.algorithm.sort;

import java.util.Arrays;

/**
 * 直接插入排序
 * 从前往后，逐个将未排序序列中的元素插入到已排序中去。
 * 最开始，一般以第一个元素为已排序序列。
 */
public class InsertionSort {
	
	public void sort(int[] a) {
		int i, j;
		for (i = 1; i < a.length; i++) {
			int tmp = a[i];
			for (j = i; j > 0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}
			
			if (j != i) {
				a[j] = tmp;
			}
		}
	}
	
	public void sort2(int[] a) {
		int i, j;
		
		for (i = 1; i < a.length; i++) {
			
			int tmp = a[i];
			j = i;
			while (j > 0 && tmp < a[j-1]) {
				a[j] = a[j-1];
				j--;
			}
			
			if (j != i) {
				a[j] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3,1,4,7,5,8,9,6,2,0};
		new InsertionSort().sort2(a);
		System.out.println(Arrays.toString(a));
	}
}
