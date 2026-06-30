package com.rohan.techgig.codegladiators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftForGirlfriend {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		long[] budget = new long[T];

		for (int i = 0; i < T; i++) {

			int N = scan.nextInt();
			// int G = scan.nextInt();

			scan.nextLine();
			String priceInput = scan.nextLine();
			String[] pricesString = priceInput.split(" ");

			List<Integer> prices = new ArrayList<>();
			for (String price : pricesString) {
				prices.add(Integer.parseInt(price));
			}

			prices.sort((n1, n2) -> n1.compareTo(n2));

			budget[i] = 0;
			for (int j = 0; j < N; j++) {
				budget[i] += prices.get(j);
			}

			System.out.println(budget[i]);

		}

		scan.close();

	}

}
