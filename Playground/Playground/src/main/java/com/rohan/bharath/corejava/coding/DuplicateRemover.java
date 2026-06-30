package com.rohan.bharath.corejava.coding;

import java.util.ArrayList;

public class DuplicateRemover {

	public static void main(String[] args) {

		String s = "aaaaabbccccdddzzzzz";

		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char eachChar = s.charAt(i);
			if (!list.contains(eachChar)) {
				list.add(eachChar);
			}
		}

		System.out.println(list);
		String result = "";
		for (Character character : list) {
			result += character;
		}

		System.out.println(result);

	}

}
