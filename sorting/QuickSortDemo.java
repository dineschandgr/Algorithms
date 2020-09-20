package io.algorithms.sorting;

import java.util.Arrays;

public class QuickSortDemo {
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int[] arr = {5,2,1,6,4,3};
		quickSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
