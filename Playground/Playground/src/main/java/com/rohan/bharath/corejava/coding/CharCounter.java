package com.rohan.bharath.corejava.coding;

import java.util.HashMap;

public class CharCounter {

	public static void main(String[] args) {

		String s = "I am the creator of my destiny!!";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int index = 0;
		while (index < s.length()) {
			char currentChar = s.charAt(index);
			if (map.containsKey(currentChar)) {
				map.put(currentChar, map.get(currentChar) + 1);
			} else {
				map.put(currentChar, 1);
			}
			++index;
		}

		System.out.println(map);

	}

}
