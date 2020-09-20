package io.algorithms.search;

public class JumpSearchDemo {
	public static void main(String[] args) {
		JumpSearch jumpSearch = new JumpSearch();
		int[] arr = {5,7,9,13,15,18,21};
		System.out.println(jumpSearch.search(arr, 21));
	}
}
