package fr.dta.bookstore;

public class Client {
	private Long id;
	private String lastname;
	private String firstname;
	private Gender gender;
	
	private Book favoriteBook;
	
	
	public Client(String lastname, String firstname, Gender gender) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.gender = gender;
	}

	public Client(Long id, String lastname, String firstname, Gender gender, Book favoriteBook) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.gender = gender;
		this.favoriteBook = favoriteBook;
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
