package fr.dta.bookstore;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Start main");
			
//			BookstoreDB.CreateBookstoreDB();
//			BookstoreDB.bookstoreDBAddBooks();
//			BookstoreDB.bookstoreDBAddClients();
			
			
			
//			BookstoreDB_addOne.addOneBook("Manu le nouveau Napoleon", "Elmut");
//			BookstoreDB_addOne.addOneBook("Alexander");
			
			
			
			//Creer ONE book
//			Book b0 = new Book("Python par l'exemple", "Alex Martelli");
//			BookstoreDB_addOne.addOneBook(b0);

			//Creer Multiple books
			Book b1 = new Book("Manu le nouveau Napoleon", "Elmut");
			Book b2 = new Book("Le flashball pour les nuls", "Castaner X");
			BookstoreDB_addOne.addBook(b1, b2);
			
			
			
			
			
//			BookstoreDB_AddOneAchat.clientBuyBook(1L, 1L);
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
