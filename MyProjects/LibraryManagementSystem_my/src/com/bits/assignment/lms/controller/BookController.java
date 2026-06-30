package com.bits.assignment.lms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bits.assignment.lms.model.Book;

public class BookController {

	private static List<Book> library = new ArrayList<Book>();
	Book book = new Book();

	Scanner scan = new Scanner(System.in);

	public void add() {

		book.incrementID();

		System.out.print("Title: ");
		book.setTitle(scan.nextLine());

		System.out.print("Author: ");
		book.setAuthor(scan.nextLine());

		System.out.print("Subject: ");
		book.setSubject(scan.nextLine());

		System.out.print("Publish Date: ");
		book.setPublishDate(scan.nextLine());

		System.out.print("Rack No.: ");
		book.setRackNo(scan.nextLine());

		library.add(book);
	}

	public void find(String title) {

		for (int i = 0; i < library.size(); i++) {
			book = library.get(i);
			if (book.getTitle().equals(title)) {
				System.out.println(book);
			}
		}
	}

	public void remove(String title) {

		for (int i = 0; i < library.size(); i++) {
			book = library.get(i);
			if (book.getTitle().equals(title)) {
				library.remove(book);
			}
		}
	}

	public void edit() {

	}

}
