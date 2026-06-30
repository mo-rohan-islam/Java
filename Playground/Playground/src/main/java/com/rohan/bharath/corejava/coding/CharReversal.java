package com.rohan.bharath.corejava.coding;

public class CharReversal {

	public static void main(String[] args) {
		String s = "Java is awesome!!";
		String[] words = s.split(" ");
		int i = 0;
		String result = "";
		while (i < words.length) {
			result += new StringBuffer(words[i++]).reverse() + " ";
		}
		System.out.println(result.trim());
	}

}
