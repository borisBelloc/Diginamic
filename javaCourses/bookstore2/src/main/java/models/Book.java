package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String title;
	@Column
	private String author;
	@OneToMany (mappedBy = "favoriteBook" )
	private List<Client> client;
	
	
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
