package io.algorithms.sorting;

import java.util.Arrays;

public class InsertionSortDemo {
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] arr = {5,2,1,6,4};
		insertionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
