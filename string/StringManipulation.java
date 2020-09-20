package io.algorithms.string;

import java.util.List;
import java.util.Stack;

public class StringManipulation {
	public int countVowels(String str) {
		List<Character> vowels = List.of('A','E','I','O','U');
		int count = 0;
		for(char ch : str.toUpperCase().toCharArray()) {
			if(vowels.contains(ch)) {
				count++;
			}
		}
		return count;
	}
	
	public String reverse(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch : str.toCharArray())
			stack.add(ch);
		
		StringBuilder builder = new StringBuilder();
		while(!stack.isEmpty()) {
			builder.append(stack.pop());
		}
		
		return builder.toString();
	}
	
	public String reverseWords(String str) {
		Stack<String> stack = new Stack<String>();
		
		String[] arr = str.split(" ");
		for(String s : arr)
			stack.add(s);
		
		StringBuilder builder = new StringBuilder();
		while(!stack.isEmpty()) {
			builder.append(stack.pop());
			builder.append(" ");
		}
		
		return builder.toString();
	}
}
