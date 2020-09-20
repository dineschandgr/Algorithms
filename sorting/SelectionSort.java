package io.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

	public void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int minIndex = findMinIndex(arr, i);
			swap(arr,i,minIndex);
		}
	}

	private int findMinIndex(int[] arr, int i) {
		int minIndex = i;
		for(int  j =  i; j < arr.length; j++) {
			if(arr[j] < arr[minIndex]) {
				minIndex = j;
			}
		}
		return minIndex;
	}

	private void swap(int[] arr, int index1, int index2) {
		var temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
