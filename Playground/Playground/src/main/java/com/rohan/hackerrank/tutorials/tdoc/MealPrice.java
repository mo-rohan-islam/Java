package com.rohan.hackerrank.tutorials.tdoc;

public class MealPrice {

	public static void main(String[] args) {

		System.out.println(solve(10.25, 17, 5));
	}

	public static int solve(double meal_cost, int tip_percent, int tax_percent) {

		return (int) Math.round(meal_cost + ((meal_cost * tip_percent) / 100) + ((meal_cost * tax_percent) / 100));

	}

}
