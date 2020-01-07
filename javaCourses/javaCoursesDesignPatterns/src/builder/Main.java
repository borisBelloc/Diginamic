package com.stazi.diginamic.designpatterns.builder;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		BookService service = new BookService();
		
		BookCriteriaBuilder builder = new BookCriteriaBuilder();
		
		BookCriteria criteria = builder
				.withPagesMin(10)
				.withPagesMax(1300)
				.withAuthor("Tolk")
				.build();
		
		List<Book> filteredBooks = service.filter(criteria);
		filteredBooks.forEach(b -> System.out.println(b));
	}

}
