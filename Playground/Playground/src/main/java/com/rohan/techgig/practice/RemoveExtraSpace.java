package com.rohan.techgig.practice;

import java.util.Scanner;

public class RemoveExtraSpace {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence to remove space: ");
		String sentence = scan.nextLine();

//		sentence = sentence.trim();
//
//		String[] words = sentence.split("[\\s]+");
//		sentence = "";
//		for (String word : words) {
////			System.out.println(word);
//			sentence = sentence + word + " ";
//		}
//
//		System.out.println(sentence);
		
		String SPACE_REGEX = "[\\s]+";
		String REPLACE_WITH = "-";

		System.out.println(sentence.replaceAll(SPACE_REGEX, REPLACE_WITH).trim());

		scan.close();

	}

}
