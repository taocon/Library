package com.qa.Library;

public class Book extends Item implements AuthorInterface {

	private int totalPages;
	private boolean checkOut;

	public Book(String name, int id, int totalPages,boolean checkOut) {
		super(name, id,checkOut);
		this.setTotalPages(totalPages);

	}

	public void addWeight() {

	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public boolean isCheckOut() {
		return checkOut;
	}

	public void setCheckOut(boolean checkOut) {
		this.checkOut = checkOut;
	}

}
