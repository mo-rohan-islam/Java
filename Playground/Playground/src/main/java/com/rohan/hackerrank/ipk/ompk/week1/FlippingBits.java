package com.rohan.hackerrank.ipk.ompk.week1;

public class FlippingBits {

	public static void main(String[] args) {
//		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		long n = 2672014991L;
//		System.out.println(n);
		System.out.println(flippingBits(n));
	}

	public static long flippingBits(long n) {

		String binary = "";
		int digits = 0;

		System.out.println(n);

		while (n > 0) {
			int digit = (int) (n % 2);
			binary = digit + binary;
			n = n / 2;
			++digits;
		}

		System.out.println(binary);
		System.out.println(binary.length());

		for (int i = 0; i < 32 - digits; i++) {
			binary = 0 + binary;
		}

		System.out.println(binary);

		String flip = "";
		for (int i = 0; i < binary.length(); i++) {
			char c = binary.charAt(i);

			if (c == '1') {
				flip += 0;
			} else {
				flip += 1;
			}
		}

		System.out.println(flip);

		long number = 0;
		int power = 0;
		for (int i = flip.length() - 1; i >= 0; i--) {
			char c = flip.charAt(i);
			number += ((c == '1') ? 1 : 0) * Math.pow(2, power);
			power++;
		}

//		return Long.parseLong(flip, 2);
		return number;

//		String binary = Long.toBinaryString(n);
//		System.out.println(binary);
//
//		while (binary.length() < 32)
//			binary = 0 + binary;
//		System.out.println(binary);
//		System.out.println(binary.length());
//
//		binary = binary.replace('1', 'z');
//		System.out.println(binary);
//		binary = binary.replace('0', '1');
//		System.out.println(binary);
//		binary = binary.replace('z', '0');
//		System.out.println(binary);
//
//		long number = 0;
//		int power = 0;
//		for (int i = binary.length() - 1; i >= 0; i--) {
//			char c = binary.charAt(i);
//			number += ((c == '1') ? 1 : 0) * Math.pow(2, power);
//			power++;
//		}
//
////		return Long.parseLong(binary, 2);
//
//		return number;

	}

}
