package com.rohan.personal;

public class ArmstrongCheck {

	public static void main(String[] args) {

		boolean result = ArmstrongCheck.armstrongNumber(153);
		System.out.println(result);
	}

	public static boolean armstrongNumber(int n) {

		int copy = n;
		int sum = 0;

		while (copy > 0) {
			int digit = copy % 10;
			sum += (digit * digit * digit);
			copy /= 10;
		}

		if (sum == n)
			return true;
		else
			return false;
	}

}
