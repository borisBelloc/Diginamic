package com.stazi.diginamic.designpatterns.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookService {
	private List<Book> books = new ArrayList<>();
	
	public BookService() {
		init();
	}
	
	private void init() {
		books.add(new Book("Robinson Crusoe", LocalDate.of(1719, 04, 25), 340, 10, "Daniel Defoe", "William Taylor"));
		books.add(new Book("Lord of the rings", LocalDate.of(1954, 04, 13), 1200, 35, "J.R.R. Tolkien", "Allen"));
		books.add(new Book("Le rouge et le noir", LocalDate.of(1830, 10, 4), 672, 14, "Stendhal", "Levasseur"));
		books.add(new Book("Le petit Larousse", LocalDate.of(1905, 07, 17), 2048, 40, "Pierre Larousse", "Larousse"));
	}
	
	public List<Book> filter(BookCriteria criteria) {
		return books.stream()
			.filter(b -> criteria.getAuthor() == null || b.getAuthor().toLowerCase().contains(criteria.getAuthor().toLowerCase()))
//			.filter(new Predicate<Book>() {
//				@Override
//				public boolean test(Book b) {
//					return criteria.getAuthor() == null 
//							|| b.getAuthor().toLowerCase().contains(criteria.getAuthor().toLowerCase());
//				}
//			})
			.filter(b -> criteria.getPagesMax() == null || b.getPages() <= criteria.getPagesMax())
			.filter(b -> criteria.getPagesMin() == null || b.getPages() >= criteria.getPagesMin())
//			.filter(...)
			.collect(Collectors.toList());
	}
}
