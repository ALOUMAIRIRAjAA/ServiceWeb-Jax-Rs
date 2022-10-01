package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entity.bachelier;

public class bachelierdao{
	private static final int concour = 0;
	private Connection connection;
	private PreparedStatement preparedStatement;
	
	
	//@Override
	public bachelier getBachelier( String cin, String N_bachelier) {
		bachelier etudiant = new bachelier();
		connection = Connexion.getInstance().getConnection();
     
		try {
			Statement st = connection.createStatement();
			String sql1 = "select * from bachelier where cin = '" + cin +"' and numero =" + N_bachelier + "";
			ResultSet result = st.executeQuery(sql1);
			result.next();
				etudiant.setId(result.getInt("id"));
				etudiant.setNom(result.getString("nom"));
				etudiant.setPrenom(result.getString("prenom"));
				etudiant.setCin(result.getString("cin"));
				etudiant.setN_etudiant(result.getString("numero"));
				etudiant.setConcours(result.getInt("concour"));
				etudiant.setArab(result.getFloat("arab"));
				etudiant.setMath(result.getFloat("math"));
				etudiant.setPc(result.getFloat("pc"));
				etudiant.setEng(result.getFloat("eng"));

			
			return etudiant;
						
			}catch(SQLException e) {
				System.out.println("Erreur sql " + e.getMessage());
			}
			return null;
}
	
	public boolean isAccepted(String cin,String numero) {
		connection = Connexion.getInstance().getConnection();
		bachelier etudiant = new bachelier();
		etudiant=getBachelier(cin,numero);
		float arab = 0,math = 0,eng = 0,pc = 0;
	
		try {
			preparedStatement = connection.prepareStatement("SELECT * FROM bachelier WHERE cin = ? and numero = ?");
			preparedStatement.setString(1,cin);
			preparedStatement.setString(2, numero);

			ResultSet result = preparedStatement.executeQuery();
			while(result.next()) {
				
				arab=result.getFloat("arab");
				math=result.getFloat("math");
				pc=result.getFloat("pc");
				eng=result.getFloat("eng");	
			}
			if(arab>=12 &&  math>=12 && pc>=12 && eng>=12) {
				return true;
				
			}
			else 
				return false;
			
			}catch(SQLException e) {
				System.out.println("Erreur sql " + e.getMessage());
			}
			return false;
	}
	
	public boolean isCandidat(String cin,String numero) {
		connection = Connexion.getInstance().getConnection();
		bachelier etudiant = new bachelier();
		etudiant=getBachelier(cin,numero);
		float arab = 0,math = 0,eng = 0,pc = 0;
	
		try {
			preparedStatement = connection.prepareStatement("SELECT * FROM bachelier WHERE cin = ? and numero = ? and concour = 3");
			preparedStatement.setString(1,cin);
			preparedStatement.setString(2, numero);

			ResultSet result = preparedStatement.executeQuery();
			result.next();
			if (result.getRow() == 0)
				return true;
			else
				return false;	
			}catch(SQLException e) {
				System.out.println("Erreur sql " + e.getMessage());
			}
		
		return true;
	}
		
	
	
	
	public boolean Update(String cin,String numero) {
		connection = Connexion.getInstance().getConnection();
		String sql = "update bachelier set concour = 1 where cin = ? and numero = ?";
		
	     try {
		    preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,cin);
			preparedStatement.setString(2, numero);
			preparedStatement.executeUpdate();
			
			System.out.println("Database updated successfully ");
			
				return true;
				
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	     return false;
	     }

			
			}


