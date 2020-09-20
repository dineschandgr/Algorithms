package io.algorithms.search;

public class LinearSearch {
	public int search(int[] arr, int element) {
		for(int i = 0; i< arr.length; i++){
			if(element == arr[i])
				return i;
		}
		
		return -1;
	}
}
