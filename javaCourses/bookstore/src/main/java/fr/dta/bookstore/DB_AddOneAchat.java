package fr.dta.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.dta.bookstore.models.*;

public class DB_AddOneAchat {
	
	public static void clientBuyBook(Long id_client, Long id_book) throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/bookstore";

		try (Connection conn = DriverManager.getConnection(url, "postgres", "afpa1234")) {

			System.out.println("Début ->");

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO achat(id_client, id_book) VALUES(?, ?)");

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
