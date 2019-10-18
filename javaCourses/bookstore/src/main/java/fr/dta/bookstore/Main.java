package fr.dta.bookstore;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
//			BookstoreDB.CreateBookstoreDB();
//			BookstoreDB.bookstoreDBAddBooks();
//			BookstoreDB.bookstoreDBAddClients();
			
//			BookstoreDB_addOne.addOneBook("Manu le nouveau Napoleon", "Bush fils");
			BookstoreDB_addOne.addOneBook("Alexander");
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
