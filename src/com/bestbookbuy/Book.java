package com.bestbookbuy;

public class Book {
	private String title;
	private String isbn;
	private float price;
	private String authors[];
	
	/*public Book(String title, String isbn, float price, String[] authors) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.authors = authors;
	}*/
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	
}
