package io.algorithms.string;

public class StringManipulationDemo {
	public static void main(String[] args) {
		StringManipulation strManipulation = new StringManipulation();
		String str = "hello";
		System.out.println(strManipulation.countVowels(str));
		System.out.println(strManipulation.reverse(str));
		System.out.println(strManipulation.reverseWords("Trees are beautiful"));
	}
}
