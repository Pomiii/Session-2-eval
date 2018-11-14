package pomNico;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Main {
	public static void main (String[] args){
		
		connexion();
	}
	
	public static void connexion() {
	try
	{
		// chargement de la classe du pilote JDBC
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/bd_apprenant?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		// bd-avion est le nom de votre base de données

		Connection connexion=DriverManager.getConnection(url,"root","root");
		JOptionPane.showMessageDialog(null,"Bravo, vous êtes connecté","Bienvenue",JOptionPane.INFORMATION_MESSAGE);
		
		
		
			
		
		
		connexion.close();
	}
	catch(Exception e)
	{
		System.out.println ("Zut, la connexion a échoué");
		e.printStackTrace ();
	}  

}

}
