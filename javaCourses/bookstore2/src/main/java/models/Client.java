package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String lastname;
	@Column
	private String firstname;
	
    @Enumerated(EnumType.STRING)
	@Column
	private Gender gender;
	@ManyToOne
	private Book favoriteBook;
	
	
	public Client(String lastname, String firstname, Gender gender) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.gender = gender;
	}

	public Client(String lastname, String firstname, Gender gender, Book favoriteBook) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.gender = gender;
		this.favoriteBook = favoriteBook;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Book getFavoriteBook() {
		return favoriteBook;
	}
	public void setFavoriteBook(Book favoriteBook) {
		this.favoriteBook = favoriteBook;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", gender=" + gender
				+ ", favoriteBook=" + favoriteBook + "]";
	}
}
