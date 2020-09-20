package io.algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
	public void sort(int[] arr, int noOfBuckets) {
		var buckets = createBuckets(arr, noOfBuckets);
		int i = 0;
		for(var bucket : buckets) {
			Collections.sort(bucket);
			for(var item : bucket)
				arr[i++] = item;
		}
	}

	private List<List<Integer>> createBuckets(int[] arr, int noOfBuckets) {
		List<List<Integer>> buckets = new ArrayList<>();
		for(int i = 0; i < noOfBuckets; i++)
			buckets.add(new ArrayList<>());
		
		for(int item : arr) {
			buckets.get(item / noOfBuckets).add(item);
		}
		
		return buckets;
	}
}
