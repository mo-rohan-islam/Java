package com.rohan.bharath.interviewquestions.coding;

public class StringReverser {

	public static void main(String[] args) {

//		new StringBuffer("abc").reverse();

		System.out.println(reverse("Rohan", ""));

	}

	public static String reverse(String s, String r) {

//		String reverse = "";
//		while(reverse.length() != s.length())
//			reverse += reverse(s.charAt(s.length()-reverse.length()-1));
//		
		if (s.length() == r.length())
			return r;
		else {
			return reverse(s, r += (s.charAt(s.length() - r.length() - 1)));
		}

	}

}
