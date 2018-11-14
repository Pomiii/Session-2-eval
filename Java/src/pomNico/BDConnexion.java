package pomNico;

import javax.swing.JOptionPane;

/**
 *  
 * @author Nico
 *
 */

public class BDConnexion {
	
	public  void Connexion() {
		
	
	String utilisateur="root";
	String motDePasse="root";
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/bd_apprenant?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";  
					
	
	

	
	
		try
		{
			Class.forName(driver).newInstance();
			JOptionPane.showMessageDialog(null,"Félicitations, vous êtes connecté","Bienvenue",JOptionPane.INFORMATION_MESSAGE);

		}
		catch (Exception e)
		{

			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Pilote non valide ou introuvable !","AccesBD",JOptionPane.WARNING_MESSAGE);
		
		
	}
}
}

	