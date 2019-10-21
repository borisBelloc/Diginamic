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
	
	
	
	EntityManager em = DatabaseHelper.createEntityManager();
	em.getTransaction().begin();
	em.persist(book0);
	em.persist(client0);
	em.persist(client1);
	
	
	DatabaseHelper.commitTxAndClose(em);
	
	}
	
	

}
