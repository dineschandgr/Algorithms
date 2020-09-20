package io.algorithms.search;

public class ExponentialSearchDemo {
	public static void main(String[] args) {
		ExponentialSearch exponentialSearch = new ExponentialSearch();
		int[] arr = {1,2,3,4,5,6,7,45,87,92};
		System.out.println(exponentialSearch.search(arr, 5));
	}
}
