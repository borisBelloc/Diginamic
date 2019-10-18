package fr.dta.bookstore;

public class Achat {
	private Long id;
	private Long id_client;
	private Long id_book;
	
//	public Achat(Long id, Long id_client, Long id_book) {
	public Achat(Long id_client, Long id_book) {
		super();
//		this.id = id;
		this.id_client = id_client;
		this.id_book = id_book;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_client() {
		return id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}

	public Long getId_book() {
		return id_book;
	}

	public void setId_book(Long id_book) {
		this.id_book = id_book;
	}

	@Override
	public String toString() {
		return "Achat [id=" + id + ", id_client=" + id_client + ", id_book=" + id_book + "]";
	}
	
	
	

}
