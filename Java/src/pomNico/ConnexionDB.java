package pomNico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConnexionDB {

	private static Connection connexion =null;


	public static void connexion() {

		
			try
			{

				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/bd_apprenant?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


				connexion=DriverManager.getConnection(url,"root","root");
				JOptionPane.showMessageDialog(null,"Bravo, vous êtes connecté","Bienvenue",JOptionPane.INFORMATION_MESSAGE);


			}
			catch(Exception e)
			{
				System.out.println ("Zut, la connexion a échoué");
				e.printStackTrace ();
			}  

		}
	


	public static void closeConnexion()
	{
		if (connexion!=null)
		{
			try
			{
				connexion.close();
				System.out.println("Fermeture de la connection.");
			}

			catch(Exception e)
			{
				System.out.println("Fermeture de la Connection Impossible !");
				e.printStackTrace();
			}
		}
	}
	public static ResultSet executerQuery(String requete) throws ClassNotFoundException, SQLException

	{
		/*
		 * 	On d�clare un objet de type Statement que l'on nomme instruction. Cet
		 * 	objet soumet la requ�te � la base de donn�es dans MySQL.
		 * 	On d�clare un objet de type ResultSet que l'on nomme resultat. cet objet
		 * 	est retourn� pour encapsuler les r�sultats de la requ�te. Il va nous permettre
		 * 	de manipuler les r�sultats de la requ�te.
		 *
		 */
		Statement statement = null;
		ResultSet resultat = null;


		try {

			statement = getConnexion().createStatement();
			

			resultat = statement.executeQuery(requete);

		}

		catch(SQLException e)
		{

			e.printStackTrace();
			System.exit(-1);
		}
		return resultat;	// retourne un ResultSet


	}



	public static Connection getConnexion() {
		return connexion;
	}



	public static void setConnexion(Connection connexion) {
		ConnexionDB.connexion = connexion;
	}



	
}
