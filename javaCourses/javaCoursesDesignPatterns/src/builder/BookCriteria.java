package com.stazi.diginamic.designpatterns.builder;

import java.time.LocalDate;

public class BookCriteria {
	private String title;
	private LocalDate releaseDateMin;
	private LocalDate releaseDateMax;
	private Integer pagesMin;
	private Integer pagesMax;
	private Integer priceMin;
	private Integer priceMax;
	private String author;
	private String publisher;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getReleaseDateMin() {
		return releaseDateMin;
	}
	public void setReleaseDateMin(LocalDate releaseDateMin) {
		this.releaseDateMin = releaseDateMin;
	}
	public LocalDate getReleaseDateMax() {
		return releaseDateMax;
	}
	public void setReleaseDateMax(LocalDate releaseDateMax) {
		this.releaseDateMax = releaseDateMax;
	}
	public Integer getPagesMin() {
		return pagesMin;
	}
	public void setPagesMin(Integer pagesMin) {
		this.pagesMin = pagesMin;
	}
	public Integer getPagesMax() {
		return pagesMax;
	}
	public void setPagesMax(Integer pagesMax) {
		this.pagesMax = pagesMax;
	}
	public Integer getPriceMin() {
		return priceMin;
	}
	public void setPriceMin(Integer priceMin) {
		this.priceMin = priceMin;
	}
	public Integer getPriceMax() {
		return priceMax;
	}
	public void setPriceMax(Integer priceMax) {
		this.priceMax = priceMax;
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
}
