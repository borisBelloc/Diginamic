package fr.dta.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookstoreDB_AddOneAchat {
	
	public static void clientBuyBook(Long id_client, Long id_book) throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO achat(title, author) VALUES(?, ?)");

			List<Achat> achats = new ArrayList<>();
			achats.add(new Achat(id_client, id_book));

			for (Achat achat : achats) {
				stmt.setString(1, achat.getId_client().toString());
				stmt.setString(2, achat.getId_book().toString());
				stmt.executeUpdate();
			}
			stmt.close();
			conn.close();

			System.out.println("<- Done");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	{
		
	Statement stmt = conn.createStatement();
	stmt.executeUpdate("INSERT INTO book(title, author) VALUES('What''s New in Java 8', 'Adam
	L. Davis')", Statement.RETURN_GENERATED_KEYS);
	ResultSet generatedKeys = stmt.getGeneratedKeys();
	generatedKeys.next();
	long id = generatedKeys.getLong("id");
	}

	
	
}
