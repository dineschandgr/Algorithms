package io.algorithms.sorting;

import java.util.Arrays;

public class CountingSortDemo {
	public static void main(String[] args) {
		CountingSort countingSort = new CountingSort();
		int[] arr = {5,2,1,6,4,3};
		countingSort.sort(arr,6);
		System.out.println(Arrays.toString(arr));
	}

}
