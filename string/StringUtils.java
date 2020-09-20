package io.algorithms.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StringUtils {
	public static int countVowels(String str) {
		if(str == null)
			return 0;
		List<Character> vowels = List.of('A','E','I','O','U');
		int count = 0;
		for(char ch : str.toUpperCase().toCharArray()) {
			if(vowels.contains(ch))
				count++;
		}
		return count;
	}
	
	public static String reverseUsingStack(String str) {
		if(str == null)
			return null;
		Stack<Character> stack = new Stack<Character>();
		for(char ch : str.toCharArray())
			stack.add(ch);
		
		StringBuilder builder = new StringBuilder();
		while(!stack.isEmpty()) {
			builder.append(stack.pop());
		}
		
		return builder.toString();
	}
	
	public static String reverse(String str) {
		if(str == null)
			return "";
		StringBuilder reversed = new StringBuilder();
		str.toCharArray();
		for(int i = str.length() - 1; i >=0; i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
		
	}
	
	public static String reverseWordsUsingStack(String str) {
		if(str == null)
			return null;
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
	
	public static String reverseWords(String str) {
		if(str == null)
			return "";
		
		String[] arr = str.trim().split(" ");
		StringBuilder reversed = new StringBuilder();
		
		for(int i = arr.length - 1; i >=0; i--) {
			reversed.append(arr[i] + " ");
		}
		return reversed.toString().trim();
	}
	
	public static String reverseWordsCollection(String str) {
		if(str == null)
			return "";
		
		String[] arr = str.trim().split(" ");
		Collections.reverse(Arrays.asList(arr));
		return String.join(" ", arr);
	}
}
