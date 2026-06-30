package com.bits.assignment.lms.model;

import java.util.List;

public class Member {

	private static int uid;
	private String firstName;
	private String lastName;
	private Boolean member;
	private List<String> bookList;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		Member.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean isMember() {
		return member;
	}

	public void setMember(Boolean member) {
		this.member = member;
	}

	public List<String> getBookList() {
		return bookList;
	}

	public void setBookList(List<String> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Member [uid=" + uid + ", firstName=" + firstName + ", lastName=" + lastName + ", member=" + member
				+ ", bookList=" + bookList + "]";
	}

}
