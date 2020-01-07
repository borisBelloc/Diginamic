package com.stazi.diginamic.designpatterns.builder;

import java.time.LocalDate;

public class Book {
	private String title;
	private LocalDate releaseDate;
	private int pages;
	private int price;
	private String author;
	private String publisher;
	
	public Book(String title, LocalDate releaseDate, int pages, int price, String author, String publisher) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.pages = pages;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", releaseDate=" + releaseDate + ", pages=" + pages + ", price=" + price
				+ ", author=" + author + ", publisher=" + publisher + "]";
	}
}
