package pomNico;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class Requetes {

	public static ArrayList<Apprenant> afficherApprenantNom() throws ClassNotFoundException, SQLException

	{
		ArrayList<Apprenant>  apprenants = new ArrayList<Apprenant>();
		String requete	= "SELECT nomApprenant, prenomApprenant FROM `apprenant` ";
		ResultSet resultat = ConnexionDB.executerQuery(requete);
		while(resultat.next())
		{
			
			Apprenant apprenant = new Apprenant();
			apprenant.setNomApprenant(resultat.getString("nomApprenant"));
			apprenant.setPrenomApprenant(resultat.getString("prenomApprenant"));
			apprenants.add(apprenant);
			
		}
		
		
		return apprenants;
	}
	
	
}

