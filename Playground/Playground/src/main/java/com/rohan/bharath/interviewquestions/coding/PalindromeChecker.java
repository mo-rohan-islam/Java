package com.rohan.bharath.interviewquestions.coding;

public class PalindromeChecker {

	public static void main(String[] args) {

		System.out.println(isPalindrome("step on no pets"));

	}

	public static boolean isPalindrome(String s) {
		if (s == null) {
			throw new IllegalArgumentException("Input cannot be null");
		}

		String reverse = new StringBuilder(s).reverse().toString();

		return s.equalsIgnoreCase(reverse);
	}

}
