package io.algorithms.search;

public class LinearSearchDemo {
	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		int[] arr = {5,2,1,6,4,3};
		System.out.println(linearSearch.search(arr, 6));
	}
}
