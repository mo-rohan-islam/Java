package com.bits.assignment.lms.dashboard;

import java.util.Scanner;

import com.bits.assignment.lms.controller.BookController;

public class Dashboard {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BookController manageBook = new BookController();

		manageBook.add();

		System.out.print("\nEnter title to search: ");
		manageBook.find(scan.nextLine());

		System.out.print("\nEnter title to delete: ");
		manageBook.remove(scan.nextLine());

		System.out.print("\nEnter title to search: ");
		manageBook.find(scan.nextLine());
		
		scan.close();
	}

}
