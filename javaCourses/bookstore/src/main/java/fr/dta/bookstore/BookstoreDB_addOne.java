package fr.dta.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookstoreDB_addOne {

	/**
	 * @DEPRECADED Add one book, only title
	 * @param title
	 * @throws SQLException
	 */
	@Deprecated
	public static void addOneBook(String title) throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO book(title) VALUES(?)");

			List<Book> books = new ArrayList<>();
			books.add(new Book(title));

			for (Book book : books) {
				stmt.setString(1, book.getTitle());
				stmt.executeUpdate();
			}
			stmt.close();
			conn.close();

			System.out.println("<- Done");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Add one book, full parameters
	 * 
	 * @param title
	 * @param author
	 * @throws SQLException
	 */
	public static void addBook(Book... listBook ) throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/bookstore";
		
		
		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO book(title, author) VALUES(?, ?)"
					, Statement.RETURN_GENERATED_KEYS);
			
			ResultSet generatedKeys;

			
			for (Book book : listBook) {
				stmt.setString(1, book.getTitle());
				stmt.setString(2, book.getAuthor());
				
				stmt.executeUpdate();
				
				generatedKeys = stmt.getGeneratedKeys();
				generatedKeys.next();
				
				book.setId(generatedKeys.getLong("id"));
			}
			
			stmt.close();
			conn.close();

			System.out.println("<- Done");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void addFavorite(Long id_client, Long id_book) {
		
//		TODO Finir
		
//		String url = "jdbc:postgresql://localhost:5432/bookstore";
//
//		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {
//
//			System.out.println("Début ->");
//
//			PreparedStatement stmt = conn.prepareStatement("INSERT INTO achat(id_client, id_book) VALUES(?, ?)");
//
//			stmt.setLong(1, id_client);
//			stmt.setLong(2, id_book);
//			stmt.executeUpdate();
//
//			stmt.close();
//			conn.close();
//
//			System.out.println("<- Done");
//
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

	}

}
