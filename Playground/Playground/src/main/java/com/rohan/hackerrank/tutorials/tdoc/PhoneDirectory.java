package com.rohan.hackerrank.tutorials.tdoc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			map.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			if (map.get(s) != null)
				System.out.println(s + "=" + map.get(s));
			else
				System.out.println("Not found");
		}
		in.close();

	}

}
