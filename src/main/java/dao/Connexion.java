package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	private static Connexion instance;

	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/concours?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","");
		} catch (Exception e) {
			System.out.println("Erreur " + e.getMessage());
		}
		return connection;
	}

	public static Connexion getInstance() {
		if(instance == null) {
			instance = new Connexion();
		}
		return instance;
	}
	

}