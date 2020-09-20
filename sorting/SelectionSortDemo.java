package io.algorithms.sorting;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int arr[] = {5,2,1,6,4,9,3};
		selectionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
