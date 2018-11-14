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
		
		System.out.println("Nom et Prénom de tous les apprenants");
		return apprenants;
	}
	
	
	public static ArrayList<Apprenant> afficherApprenantIDF() throws ClassNotFoundException, SQLException

	{
		ArrayList<Apprenant>  apprenants = new ArrayList<Apprenant>();
		String requete	= "SELECT  nomApprenant, prenomApprenant FROM `apprenant` WHERE idRegion = 1";
		ResultSet resultat = ConnexionDB.executerQuery(requete);
		while(resultat.next())
		{
			
			Apprenant apprenant = new Apprenant();
			apprenant.setNomApprenant(resultat.getString("nomApprenant"));
			apprenant.setPrenomApprenant(resultat.getString("prenomApprenant"));
			apprenants.add(apprenant);
			
		}
		
		System.out.println("Liste des habitants de l'IDF :");
		return apprenants;
	}
	
	public static ArrayList<Apprenant> afficherApprenantPL() throws ClassNotFoundException, SQLException

	{
		ArrayList<Apprenant>  apprenants = new ArrayList<Apprenant>();
		String requete	= "SELECT  nomApprenant, prenomApprenant FROM `apprenant` WHERE idRegion = 2";
		ResultSet resultat = ConnexionDB.executerQuery(requete);
		while(resultat.next())
		{
			
			Apprenant apprenant = new Apprenant();
			apprenant.setNomApprenant(resultat.getString("nomApprenant"));
			apprenant.setPrenomApprenant(resultat.getString("prenomApprenant"));
			apprenants.add(apprenant);
			
		}
		
		System.out.println("Liste des habitants du Pays de la Loire :");
		return apprenants;
	}
	
	public static ArrayList<Apprenant> afficherApprenantAq() throws ClassNotFoundException, SQLException

	{
		ArrayList<Apprenant>  apprenants = new ArrayList<Apprenant>();
		String requete	= "SELECT  nomApprenant, prenomApprenant FROM `apprenant` WHERE idRegion = 2";
		ResultSet resultat = ConnexionDB.executerQuery(requete);
		while(resultat.next())
		{
			
			Apprenant apprenant = new Apprenant();
			apprenant.setNomApprenant(resultat.getString("nomApprenant"));
			apprenant.setPrenomApprenant(resultat.getString("prenomApprenant"));
			apprenants.add(apprenant);
			
		}
		
		System.out.println("Liste des habitants du Pays de l'Aquitaine :");
		return apprenants;
	}
}

