package org.buzheng.study.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 每一遍找出未排序序列中的最大/最小的值的位置，然后将此位置的值交换到未排序序列的开始，
 * 一直重复，直到全部排好。
 */
public class SelectionSort {

	public void sort(int[] input) {
		if (input == null || input.length <= 1) 
			return;
		
		for (int i = input.length - 1; i > 0; i--) {
			int index = i; // 记录索引
			for (int j = i-1; j > 0; j--) {
				if (input[i] < input[j]) {
					index = j;
				}
			}
			
			if (index != i) {
				int tmp = input[i];
				input[i] = input[index];
				input[index] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] input = {5,2,6,1,4,3};
		new BubbleSort().sort(input);
		System.out.println(Arrays.toString(input));
	}

}
