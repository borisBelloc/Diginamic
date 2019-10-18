package fr.dta.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BookstoreDB {
	
	public BookstoreDB() {
		
	}

	public static void CreateBookstoreDB() throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234");
				Statement stmt = conn.createStatement()) {

			System.out.println("Début");

			stmt.executeUpdate("DROP TABLE IF EXISTS book;");
			stmt.executeUpdate("CREATE TABLE book(id bigserial PRIMARY KEY, " +
			       "title varchar(255) NOT NULL, " +
			       "author varchar(255))");
			
			stmt.executeUpdate("DROP TABLE IF EXISTS client;");
			stmt.executeUpdate("CREATE TABLE cliend(id bigserial PRIMARY KEY, " +
				       "lastname varchar(50) NOT NULL, " +
				       "firstname varchar(50) NOT NULL, " +
				       "gender varchar(50) NOT NULL)");
			
			System.out.println("Done");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
