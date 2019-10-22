package fr.dta.bookstore;

import java.sql.*;

public class DatabaseHelper {
	
//	
//	FICHIER PAS UTILISEE
//  EXEMPLE DE FICHIER POUR UTILISER LA CONNECTION DANS FICHIER EXTERNE
//	voir .rar jdbc-sample-master : correction formateur google drive 

	static String url = "jdbc:postgresql://localhost:5432/bookstore";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, "postgres", "afpa1234");
	}

	public static Statement newStatement() {
		try {
			return getConnection().createStatement();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static PreparedStatement newPreparedStatement(String sql, boolean autoGeneratedKeys) {
		try {
			return getConnection().prepareStatement(sql,
					autoGeneratedKeys ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void close(Statement stmt) {
		try {
			stmt.close();
			stmt.getConnection().close();
		} catch (SQLException e) {
			System.err.println("Can not close statement or connexion");
		}
	}
}