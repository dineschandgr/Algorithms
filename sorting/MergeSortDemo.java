package io.algorithms.sorting;

import java.util.Arrays;

public class MergeSortDemo {
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int[] arr = {5,2,1,6,4};
		mergeSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
