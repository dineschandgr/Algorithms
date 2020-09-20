package io.algorithms.sorting;

import java.util.Arrays;

public class BucketSortDemo {

	public static void main(String[] args) {
		BucketSort bucketSort = new BucketSort();
		int[] arr = {5,2,1,6,4,3};
		bucketSort.sort(arr,3);
		System.out.println(Arrays.toString(arr));
	}

}
