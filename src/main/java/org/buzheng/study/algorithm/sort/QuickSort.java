package org.buzheng.study.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
	
	public void sort(int[] input) {
		quickSort(input, 0, input.length-1);
	}
	
	private void quickSort(int[] input, int low, int high) {
		if (low < high) {  
			int middle = this.getMiddle(input, low, high);
			this.quickSort(input, low, middle-1);
			this.quickSort(input, middle+1, high);
		}
	}

	private int getMiddle(int[] input, int low, int high) {
		int tmp = input[low]; // 取一个基准元素
		
		while (low < high) {			
			while (low < high && input[high] >= tmp) {
				high--;
			}
			
			input[low] = input[high];
			
			while (low < high && input[low] < tmp) {
				low++;
			}
			
			input[high] = input[low];
			
		}
		
		input[low] = tmp;		
		return low;
	}
	
	public static void main(String[] args) {
		int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		new QuickSort().sort(a);
		System.out.println(Arrays.toString(a));
	}

}
