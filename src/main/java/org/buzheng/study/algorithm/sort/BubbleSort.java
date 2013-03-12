package org.buzheng.study.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序法
 * 从第一个元素开始，不停比较的相邻的两个元素，如果发现次序不对，则交换位置。知道所有的元素都比较完。
 */
public class BubbleSort {
	
	public void sort(int[] input) {
		for (int i = input.length -1; i >= 0; i--) {
			for (int j = i-1; j >= 0; j--) {
				if (input[i] < input[j]) {
					int tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}
	}
	
	public void sort2(int[] input) {
		for (int i = input.length - 1; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				if (input[j] < input[j-1]) {
					int tmp = input[j];
					input[j] = input[j-1];
					input[j-1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] input = {5,2,6,1,4,3};
		new BubbleSort().sort2(input);
		System.out.println(Arrays.toString(input));
	}
}
