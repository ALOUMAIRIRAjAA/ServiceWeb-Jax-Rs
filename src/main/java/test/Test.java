package test;

import java.sql.Connection;



import dao.Connexion;
import dao.bachelierdao;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection = Connexion.getInstance().getConnection();
		if(connection!=null)
			System.out.println("Suceee");
		else
			System.out.println("Noooo");
		
		bachelierdao bacheier=new bachelierdao();
		
		System.out.println(bacheier.getBachelier("G1234", "123"));
		System.out.println(bacheier.isAccepted("G1234", "123"));
		
		System.out.println(bacheier.isCandidat("G1234", "123"));
		bacheier.Update("G1234", "123");
		System.out.println("Database updated successfully ");
		

		System.out.println("Grasias ");
		
	}

}
