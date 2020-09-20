package io.algorithms.string;

public class StringManipulationDemo {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(StringUtils.countVowels(str));
		System.out.println(StringUtils.reverse(str));
		System.out.println(StringUtils.reverseWords("Trees are beautiful"));
	}
}
