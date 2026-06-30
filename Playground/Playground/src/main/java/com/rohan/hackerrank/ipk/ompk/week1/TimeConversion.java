package com.rohan.hackerrank.ipk.ompk.week1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {

		String input = "10:22:12PM";

		DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

		Date date = null;
		String output = null;

		date = inputFormat.parse(input);
		output = outputFormat.format(date);

		System.out.println(output);

	}

}
