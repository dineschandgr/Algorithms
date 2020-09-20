package io.algorithms.search;

public class BinarySearchDemo {
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = {1,2,3,4,5,6,7,45,87,92};
		System.out.println(binarySearch.searchIteration(arr, 1));
	}
}
