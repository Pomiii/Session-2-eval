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
		
		Statement statement = null;
		ResultSet resultat = null;


		try {

			
			statement = ConnexionDB.getConnexion(statement);
			

			resultat = statement.executeQuery(requete);

		}

		catch(SQLException e)
		{

			e.printStackTrace();
			System.exit(-1);
		}
		return resultat;	

	}
	public static Statement getConnexion(Statement statement) {
		// TODO Auto-generated method stub
		return statement;
	}

}
