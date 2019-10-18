package fr.dta.bookstore;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
//			BookstoreDB.CreateBookstoreDB();
//			BookstoreDB.bookstoreDBAddBooks();
//			BookstoreDB.bookstoreDBAddClients();
			
//			BookstoreDB_addOne.addOneBook("Manu le nouveau Napoleon", "Bush fils");
//			BookstoreDB_addOne.addOneBook("Alexander");
			
			
			//Creer book
//			Book b1 = new Book("web facile", "Arthur 2");
//			BookstoreDB_addOne.addBook(b1);
			
			
			
			
			
			BookstoreDB_AddOneAchat.clientBuyBook(1L, 1L);
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
