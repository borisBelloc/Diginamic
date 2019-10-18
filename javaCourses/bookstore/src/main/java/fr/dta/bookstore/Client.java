package fr.dta.bookstore;

public class Client {
	private Long id;
	private String lastname;
	private String firstname;
	private Gender gender;
	
	public Client(String lastname, String firstname, Gender gender) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.gender = gender;
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
	@Override
	public String toString() {
		return "Client [lastname=" + lastname + ", firstname=" + firstname + ", gender=" + gender + "]";
	}
	

}
