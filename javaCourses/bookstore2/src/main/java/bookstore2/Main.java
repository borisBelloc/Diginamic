package bookstore2;

import javax.persistence.EntityManager;

import models.Book;
import models.Client;
import models.Gender;

public class Main {

	public static void main(String[] args) {

		
	Book book0 = new Book("Livre1", "Auteur1");
	Client client0 = new Client("Trudeau", "Justin", Gender.MALE);
	Client client1 = new Client("Alexia", "Dabord", Gender.FEMALE);
	Book book3 = new Book("Livre3", "Auteur3");
	
	Client client2 = new Client ("Picsou", "Duck", Gender.FLUID);
	Book book1 = new Book("Monaie", "Rubby-A");
	
	
	
	EntityManager em = DatabaseHelper.createEntityManager();
	
	em.getTransaction().begin();
	
	em.persist(book0);
	em.persist(client0);
	em.persist(client1);
	em.persist(client2);
	em.persist(book1);
	em.persist(book3);
	
	// ACHAT LIVRE
	client2.addBookClient(book1);
//	em.merge(client2);
	client2.addBookClient(book3);
//	em.merge(client2);
	
	//-------------------
//	client0.addBookClient(book3);
//	em.merge(client0);
	// ----------------------------
	
	// AJOUT LIVRE FAVORIS
	client1.setFavoriteBook(book0);
//	em.merge(client1);
	
	// quels livres ont ét acheté
	
	DatabaseHelper.commitTxAndClose(em);
	
//	EntityManager em2 = DatabaseHelper.createEntityManager();
//	client0.addBookClient(book3);
//	em2.merge(client0);
//	DatabaseHelper.commitTxAndClose(em2);
//	
	
	
	
	
	
	// livre acheté par un certain client
	System.out.println("+++++++");
	System.out.println(client2.getBoughtBooks());
	
	
	// quels clients ont acheté un certain livre
	System.out.println("-----");
	System.out.println(book1.getClientAcheteur());
	
	
	System.out.println("///////");
	
	
	// JPQL
	// Livre acheté par un certain client
//	Utils.getBookFromClient(client2);
	
	// Tous les livres achetés
	System.out.println(Utils.booksBought2());

	}
}
