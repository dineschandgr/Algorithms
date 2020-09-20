package io.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] arr = {5,2,1,6,4};
		sort.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
