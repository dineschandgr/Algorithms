package io.algorithms.search;

public class JumpSearch {
	public int search(int[] arr, int target) {
		
		int length = arr.length;
		int partition = (int)Math.sqrt(length);
		int start = 0;
		int next = partition;
		
		while(start < length && arr[next - 1] < target){
			start = next;
			next = next + partition;
			
			if(next > length)
				next = length;
		}
		
		for(int i = start; i < next; i++) {
			if(arr[i] == target)
				return i;
		}
		
		return -1;
	}
}
