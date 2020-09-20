package io.algorithms.sorting;

public class CountingSort {
	public void sort(int[] arr, int max) {
		int[] countArr = new int[max+1];
		
		for(int n : arr)
			countArr[n]++;
		
		int k = 0;
		for(int i = 0; i <= arr.length; i++) {
			for(int j = 0 ; j < countArr[i]; j++)
				arr[k++] = i;
		}
	}
}
