package com.stazi.diginamic.designpatterns.builder;

public class BookCriteriaBuilder {
	private BookCriteria criteria = new BookCriteria();
	
	private String author;
	private int pagesMin;
	private int pagesMax;
	
	public BookCriteriaBuilder withAuthor(String author) {
		this.author = author;
		return this;
	}
	
	public BookCriteriaBuilder withPagesMin(int pagesMin) {
		this.pagesMin = pagesMin;
		return this;
	}
	
	public BookCriteriaBuilder withPagesMax(int pagesMax) {
		this.pagesMax = pagesMax;
		return this;
	}
	
	public BookCriteria build() {
		// Set author first
		criteria.setAuthor(author);
		// Set the other properties
		criteria.setPagesMin(pagesMin);
		criteria.setPagesMax(pagesMax);
		return criteria;
	}
}
