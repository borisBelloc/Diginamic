package fr.dta.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.dta.bookstore.models.Book;
import fr.dta.bookstore.models.Client;
import fr.dta.bookstore.models.Gender;

public class getData {

	public static Book getBook(String title) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/bookstore";
		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {
			
			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM book WHERE title = ?");
			stmt.setString(1, title);
			System.out.println("QUERY -> " + stmt);

			ResultSet resultSet = stmt.executeQuery();
			
			if (resultSet.next()) {
				Book book = new Book(resultSet.getString("title"),resultSet.getString("author"));
				book.setId(resultSet.getLong("id"));
				stmt.close();
				conn.close();

				System.out.println("<- Done getBook()");
				return book;
			}
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<- Done getBook()");

		return null;
	}
	
	
	public static Client getClient(long id) throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM client WHERE id = ?");
			stmt.setLong(1, id);
			System.out.println("QUERY -> " + stmt);


			ResultSet resultSet = stmt.executeQuery();

			// ---- PRINT ResultSet
//			ResultSetMetaData rsmd = resultSet.getMetaData();
//			int columnsNumber = rsmd.getColumnCount();
//			while (resultSet.next()) {
//				for (int i = 1; i <= columnsNumber; i++) {
//					if (i > 1)
//						System.out.print(" | ");
//					String columnValue = resultSet.getString(i);
//					System.out.print(columnValue + " " + rsmd.getColumnName(i));
//				}
//			}
			// END ---- PRINT ResultSet

			if (resultSet.next()) {

				Gender genderClient = Gender.valueOf(resultSet.getString("gender").toUpperCase());
				Client client = new Client(resultSet.getString("lastname"), resultSet.getString("firstname"),
						genderClient, getBook(resultSet.getString("favoriteBook")));
				client.setId(id);
				/* ,this.getBook(resultSet.getString("prefered_book"))); */

				stmt.close();
				conn.close();
				System.out.println("<- Done getClient()");
				return client;
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("<- Done getClient()");
		return null;

//		PreparedStatement stmt = conn.prepareStatement("INSERT INTO achat(id_client, id_book) VALUES(?, ?)");

//		stmt.setLong(1, id_client);
//		stmt.setLong(2, id_book);
//		stmt.executeUpdate();

	}

}
