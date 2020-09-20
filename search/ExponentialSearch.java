package io.algorithms.search;

public class ExponentialSearch {
	
	public int search(int[] arr,int target) {
		
		// find the bound
		int bound = 1;
		while(arr[bound] < target && bound < arr.length) {
			bound = bound * 2;	
		}
		int left = bound / 2;
		int right = Math.min(bound, arr.length - 1);
		
		//call binary search with the bound
		return binarySearch(arr, target, left, right);
	}
	
	private int binarySearch(int[] arr,int target, int left, int right) {
		if(left > right)
			return 0;
		
		int middle = (left + right) / 2;
		if(arr[middle] == target)
			return middle;
		
		if(arr[middle] < left)
			binarySearch(arr, target, left, middle - 1);
		return binarySearch(arr, target, middle+1, right);
	}
	
}
