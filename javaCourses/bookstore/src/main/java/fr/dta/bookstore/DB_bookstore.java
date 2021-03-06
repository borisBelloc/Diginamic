package fr.dta.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.dta.bookstore.models.*;



public class DB_bookstore {

	public static void CreateBookstoreDB() throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234");
				Statement stmt = conn.createStatement()) {

			System.out.println("Début");

			stmt.executeUpdate("DROP TABLE IF EXISTS achat;");
			stmt.executeUpdate("DROP TABLE IF EXISTS book;");
			stmt.executeUpdate("DROP TABLE IF EXISTS client;");

			stmt.executeUpdate("CREATE TABLE book(id bigserial PRIMARY KEY, " + "title varchar(255) NOT NULL, "
					+ "author varchar(255))");

			stmt.executeUpdate("CREATE TABLE client(id bigserial PRIMARY KEY, " + "lastname varchar(50) NOT NULL, "
					+ "firstname varchar(50) NOT NULL, " + "gender varchar(50) NOT NULL, "
					+ "favoriteBook varchar(250))");

			stmt.executeUpdate("CREATE TABLE achat(id bigserial PRIMARY KEY, " + "id_client bigint NOT NULL , "
					+ "id_book bigint NOT NULL , " + "foreign key(id_client) REFERENCES client(id), "
					+ "foreign key(id_book) REFERENCES book(id))");

			System.out.println("Done");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	
	
	
	public static void bookstoreDBAddBooks() throws SQLException {
		
		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO book(title, author) VALUES(?, ?)");
		
			
			List<Book> books = new ArrayList<>();
			books.add(new Book("What''s New in Java 8", "Adam L. Davis"));
			books.add(new Book("Welcome to Java for Python Programmers", "Brad Miller"));

			for (Book book : books) {
				stmt.setString(1, book.getTitle());
				stmt.setString(2, book.getAuthor());
				stmt.executeUpdate();
			}
			stmt.close();
			conn.close();

			System.out.println("<- Done");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void bookstoreDBAddClients() throws SQLException {
		//Book... books
		
		
		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO client(lastname, firstname, gender) VALUES(?, ?, ?)");
		
			
			List<Client> clients = new ArrayList<>();
			clients.add(new Client("BELLOC", "Boris", Gender.MALE));
			clients.add(new Client("Macron", "Manu", Gender.FLUID));
			clients.add(new Client("Prostoktov", "Alyna", Gender.FEMALE));

			for (Client client : clients) {
				stmt.setString(1, client.getLastname());
				stmt.setString(2, client.getFirstname());
				stmt.setString(3, client.getGender().toString());
				stmt.executeUpdate();
			}
			stmt.close();
			conn.close();

			System.out.println("<- Done");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	
	
}
