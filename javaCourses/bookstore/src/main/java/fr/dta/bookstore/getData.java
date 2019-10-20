package fr.dta.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import fr.dta.bookstore.models.Client;
import fr.dta.bookstore.models.Gender;

public class getData {

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
						genderClient);
				client.setId(id);
				/* ,this.getBook(resultSet.getString("prefered_book"))); */

				stmt.close();
				conn.close();
				return client;
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

//		PreparedStatement stmt = conn.prepareStatement("INSERT INTO achat(id_client, id_book) VALUES(?, ?)");

//		stmt.setLong(1, id_client);
//		stmt.setLong(2, id_book);
//		stmt.executeUpdate();

	}

}
