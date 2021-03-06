package bookstore2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import models.Book;
import models.Client;

public class Utils {

//	public static void buyBook( Client client, Book book ) {
//		client.getId();
//		book.getId();
//		
//		client.setAddBook(book);
//	}

	public static void getBookFromClient(Client client) {

		// Select distinct * from book
		// join achat on book.id = boughtbooks_id

		// select * from achat
		// where clientacheteur_id = 4

		EntityManager em = DatabaseHelper.createEntityManager();

		TypedQuery<Book> query = em
				.createQuery("Select distinct a " + "from achat a " + "where clientacheteur_id = :id", Book.class);
//		"where b.id =:id ", Book.class);
		query.setParameter("id", client.getId());
//		User u = query.getSingleResult();

		DatabaseHelper.commitTxAndClose(em);

	}

	public static List<Book> booksBought2() {

		EntityManager em = DatabaseHelper.createEntityManager();
		TypedQuery<Book> query = em.createQuery("select b from Book b inner join b.client", Book.class);
		List<Book> books = query.getResultList();
//		DatabaseHelper.commitTxAndClose(em);
		return books;

	}

}
