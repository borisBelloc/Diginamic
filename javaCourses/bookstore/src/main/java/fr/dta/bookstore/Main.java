package fr.dta.bookstore;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		try {
			BookstoreDB.CreateBookstoreDB();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
