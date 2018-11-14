package pomNico;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class Requetes {

	public static ArrayList<Apprenant> afficherApprenantNom() throws ClassNotFoundException, SQLException

	{
		ArrayList<Apprenant>  apprenants = new ArrayList<Apprenant>();
		String requete	= "SELECT * FROM `apprenant` ORDER BY nomApprenant";
		ResultSet resultat = ConnexionDB.executerQuery(requete);
		while(resultat.next())
		{
			Apprenant apprenant = new Apprenant();
			apprenant.setNomApprenant(resultat.getString("nomApprenant"));
			apprenant.setPrenomApprenant(resultat.getString("prenomApprenant"));
			apprenant.setDateNaissance(resultat.getDate("dateNaissance"));
			apprenant.setEmailApprenant(resultat.getString("emailApprenant"));
			apprenant.setPhotoApprenant(resultat.getString("photoApprenant"));
			apprenant.setIdApprenant(resultat.getInt("idApprenant"));
			apprenants.add(apprenant);
		}
		return apprenants;
	}
	
	
}

