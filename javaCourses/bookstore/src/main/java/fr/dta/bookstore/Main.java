package fr.dta.bookstore;

import java.sql.SQLException;

import fr.dta.bookstore.models.*;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Start main");
			
//			DB_bookstore.CreateBookstoreDB();
//			DB_bookstore.bookstoreDBAddBooks();
//			DB_bookstore.bookstoreDBAddClients();
			
			
			//Creer ONE book
//			Book b0 = new Book("Python par l'exemple", "Alex Martelli");
//			DB_addOne.addOneBook(b0);

			//Creer Multiple books
//			Book b1 = new Book("Manu le nouveau Napoleon", "Elmut");
//			Book b2 = new Book("Le flashball pour les nuls", "Castaner X");
//			DB_addOne.addBook(b1, b2);

			//Obtenir client
			System.out.println(getData.getClient(2));

			
			
//			DB_AddOneAchat.clientBuyBook(1L, 1L);
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
