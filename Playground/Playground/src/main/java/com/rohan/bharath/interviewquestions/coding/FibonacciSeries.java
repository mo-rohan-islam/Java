package com.rohan.bharath.interviewquestions.coding;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println(fibonacci(0, 1, 15));

	}

	public static int fibonacci(int n1, int n2, int limit) {
		if (limit == 1)
			return (n1 + n2);
		else {
			System.out.print(n1 + " ");
			return fibonacci(n2, n1 + n2, limit - 1);
		}
	}

}
