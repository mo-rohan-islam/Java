package com.bits.assignment.lms.model;

public class Book {

	private static int uid = 0;

	private String title;
	private String author;
	private String subject;
	private String publishDate;
	private String rackNo;
	private String assignee;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		Book.uid = uid;
	}

	public void incrementID() {
		setUid(++uid);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getRackNo() {
		return rackNo;
	}

	public void setRackNo(String rackNo) {
		this.rackNo = rackNo;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	@Override
	public String toString() {
		return "Book [uid=" + uid + ", title=" + title + ", author=" + author + ", subject=" + subject
				+ ", publishDate=" + publishDate + ", rackNo=" + rackNo + ", assignee=" + assignee + "]";
	}

}
