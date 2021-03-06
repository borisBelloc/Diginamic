package fr.dta.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.dta.bookstore.models.*;

public class DB_addOne {

	/**
	 * Add only one book
	 * 
	 * @param Book
	 * @throws SQLException
	 */

	public static void addOneBook(Book book) throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO book(title, author) VALUES(?, ?)",
					Statement.RETURN_GENERATED_KEYS);


			ResultSet generatedKeys;

			stmt.setString(1, book.getTitle());
			stmt.setString(2, book.getAuthor());

			stmt.executeUpdate();

			generatedKeys = stmt.getGeneratedKeys();
			generatedKeys.next();

			book.setId(generatedKeys.getLong("id"));
			stmt.close();
			conn.close();


			System.out.println("<- Done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Add 0, n book
	 * 
	 * @param list of Books
	 * @throws SQLException
	 */
	public static void addBook(Book... listBook) throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO book(title, author) VALUES(?, ?)",
					Statement.RETURN_GENERATED_KEYS);

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


		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO clientt(id_client, id_book) VALUES(?, ?)");

			stmt.setLong(1, id_client);
			stmt.setLong(2, id_book);
			stmt.executeUpdate();

			stmt.close();
			conn.close();

			System.out.println("<- Done");

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
