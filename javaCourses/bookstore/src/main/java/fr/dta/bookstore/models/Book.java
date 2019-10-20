package fr.dta.bookstore.models;

public class Book {
	private Long id;
	private String title;
	private String author;
	
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
}
