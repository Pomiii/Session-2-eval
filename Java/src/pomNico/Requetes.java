package pomNico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;











public class Requetes {

	static Scanner saisie = new Scanner(System.in);

	


	//methode qui récupère le nom et le prénom de tous les apprenants et les stocke en objet
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

	// Methode qui récupère les données de la table apprenant vivant en IDF et enregistre le nom et le prénom

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

	// Methode qui récupère les données de la table apprenant vivant en PL et enregistre le nom et le prénom

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


	// Methode qui récupère les données de la table apprenant vivant en AQ et enregistre le nom et le prénom
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


	// méthode qui permet la mise à jour de la table en INSERTION (ajout d'apprenant)
	public static void ajouterApprenant(Apprenant apprenant) throws SQLException {
		PreparedStatement prepareStatement = ConnexionDB.getConnexion().prepareStatement("INSERT INTO `apprenant` VALUES( ? , ?, ?, ?, ? ,? ,?)");

		prepareStatement.setInt(1,apprenant.idApprenant);
		prepareStatement.setString(2,apprenant.nomApprenant);
		prepareStatement.setString(3,apprenant.prenomApprenant);
		prepareStatement.setString(4,apprenant.dateNaissance);
		prepareStatement.setString(5,apprenant.emailApprenant);
		prepareStatement.setString(6,apprenant.photoApprenant);
		prepareStatement.setInt(7,apprenant.regionApprenant);

		prepareStatement.executeUpdate();

	}

	//création d'un compteur d'apprenants pour l'auto incrément de l'ID lors de l'ajout d'un nouvel apprenant
	public static int getNombreApprenants() throws SQLException
	{
		ResultSet resultat = ConnexionDB.getConnexion().createStatement().executeQuery("SELECT count(*) FROM `apprenant`");
		resultat.next();
		return resultat.getInt(1);
	}

	
	public static ArrayList<Activite> afficherActivitesApprenant(String nom) throws ClassNotFoundException, SQLException

	{
		ArrayList<Activite>  listeActivites = new ArrayList<Activite>();

		String requete	= "SELECT apprenant.nomApprenant, activites.nomActivite, activites.idActivite FROM apprenant INNER JOIN fait ON apprenant.idApprenant = fait.idApprenant INNER JOIN activites ON activites.idActivite = fait.idActivite WHERE apprenant.nomApprenant='"+nom + "'";
		
		ResultSet resultat = ConnexionDB.executerQuery(requete);

		while(resultat.next())
		{
			Activite activite = new Activite();
			activite.setIdActivite(resultat.getInt("activites.idActivite"));
			activite.setNomActivite(resultat.getString("activites.nomActivite"));
			listeActivites.add(activite);
			
		}

		System.out.println("Tableau des activites pour "+ nom);

		return listeActivites;
	}
	public static void supprimerApprenant() throws SQLException, ClassNotFoundException
	{
		Statement statement = null;
String nomSupprimer = saisie.nextLine();
afficherApprenantNom();

if (afficherApprenantNom().contains(nomSupprimer)) {
		try {
			statement = ConnexionDB.getConnexion().createStatement();
			
			String suppression = "DELETE FROM Apprenant WHERE idApprenant="+nomSupprimer;
			statement.executeUpdate(suppression);
			System.out.println("L'apprenant "+ nomSupprimer+ " a été supprimé");
		}
		catch(SQLException e){
			System.out.println("Impossible de supprimer l'apprenant");
		}
}
		else System.out.println("Ce nom n'existe pas");
	}
public static ArrayList<Apprenant> afficherActivitesApp() throws ClassNotFoundException, SQLException {
		
	System.out.println("Voici la liste des activités :");
	System.out.println("001 => Programmer en java");		
	System.out.println("002 => Ecouter les mouches");
	System.out.println("003 => Jouer au bilboquet");
	System.out.println("004 => Dormir pendant le cours");
	System.out.println("005 => Chercher un stage à Haiti");
	System.out.println("006 => Attendre les vacances");		
	System.out.println("007 => Prendre le goûter");		
	System.out.println("008 => Caresser le chat");		
	System.out.println("009 => Ecouter de la musique");				
	System.out.println("010 => Rien faire");				
	System.out.println("011 => Jouer à Angular");				
	System.out.println("012 => Rêver");				
	System.out.println("013 => Travailler jour et nuit");
	System.out.println("Veuillez saisir un numéro : ");	
	
	int nActivite = saisie.nextInt();
	 
	ArrayList<Apprenant> listeActivitesParApp = new ArrayList<Apprenant>();
	

		String requete	= "SELECT * FROM apprenant INNER JOIN fait ON apprenant.idApprenant = fait.idApprenant INNER JOIN activites ON activites.idActivite = fait.idActivite WHERE Activites.idActivite=" + nActivite +"" ;
		
		ResultSet resultat = ConnexionDB.executerQuery(requete);
		Apprenant apprenant = new Apprenant();
		Activite activite = new Activite();
		while(resultat.next())
		{				
			apprenant.setIdApprenant(resultat.getInt("apprenant.IdApprenant"));
			apprenant.setNomApprenant(resultat.getString("apprenant.nomApprenant"));
			listeActivitesParApp.add(apprenant);
			System.out.println(apprenant.getNomApprenant() + "\n");
			
		activite.setIdActivite(nActivite);
		activite.setNomActivite(resultat.getString("activites.nomActivite"));
	
		}
		
		
		return listeActivitesParApp;
}
public static void modifierApprenant() throws SQLException, ClassNotFoundException
{
	System.out.println("Veuillez saisir le nom de l'apprenant à modifier");
	String ancienNom = saisie.next();
	System.out.println("Veuillez saisir le nouveau nom à affecter a" + ancienNom);
	String nouveauNom = saisie.next();
	afficherApprenantNom();
	
	try {
		PreparedStatement prepareStatement = ConnexionDB.getConnexion().prepareStatement("UPDATE apprenant SET apprenant.nomApprenant = '" + nouveauNom + "' WHERE apprenant.nomApprenant = '" +ancienNom + "'");
		
		prepareStatement.executeUpdate();
		System.out.println("Modification effectuee pour l'apprenant : "+ancienNom);

	}
		catch(SQLException e){
			
			System.out.println("Erreur lors de la modification !");
			}
	}

public static void ajouterActiviteBebert() throws SQLException {
	PreparedStatement prepareStatement = ConnexionDB.getConnexion().prepareStatement("INSERT INTO `fait` VALUES( ? , ?), (? , ?)");

	System.out.println("Ajoutons Caresser un chat et Ecouter de la musique à Bebert");
	prepareStatement.setInt(1,8);
	prepareStatement.setInt(2,33);
	prepareStatement.setInt(3,9);
	prepareStatement.setInt(4, 33);
	prepareStatement.executeUpdate();
}
public static ArrayList<Activite> afficherActiviteSansApprenant() throws ClassNotFoundException, SQLException

{
	ArrayList<Activite>  activite = new ArrayList<Activite>();
	String requete	= "SELECT * from fait right join activites on fait.idActivite = activites.idActivite where fait.idActivite is null"; 
			
	ResultSet resultat = ConnexionDB.executerQuery(requete);
	while(resultat.next())
	{

		Activite orphanActivity= new Activite();
		orphanActivity.setNomActivite(resultat.getString("activites.nomActivite"));
		orphanActivity.setIdActivite(resultat.getInt("activites.idActivite"));
		
		activite.add(orphanActivity);

	}

	System.out.println("Liste des activités orphelines :");
	return activite;
}


}
	
/**
 * Màj Nom
 */

	/**public static String getMajNom() throws SQLException
	{
		 ResultSet resultat = ConnexionDB.getConnexion().createStatement().executeQuery("UPDATE APPRENANT SET  nomApprenant = 'Rizon' WHERE idApprenant = 17 ");
		 resultat.next();
		 return resultat.getString(null);
	}
	
	/**public static void updApprenant(Apprenant apprenant) throws SQLException
	{
		
		PreparedStatement prepareStatement = ConnexionDB.getConnexion().prepareStatement("UPDATE APPRENANT.nomApprenant VALUE (?) WHERE idApprenant = 17");
		//prepareStatement.setInt(?,apprenant.getIdApprenant());
		prepareStatement.setString(1,apprenant.getDateNaissance());
		//prepareStatement.setString(?,apprenant.getEmailApprenant());
		//prepareStatement.setString(?,apprenant.getPhotoApprenant());
		//prepareStatement.setInt(?,apprenant.getIdRegionApprenant());
		prepareStatement.executeUpdate();
		
	}
	
	// Remove
	/**public static void rmvApprenant(Apprenant apprenant) throws SQLException
	{
		{
			Statement statement = null;

			try {
				statement = ConnexionDB.getConnexion().createStatement();
				String sql = "DELETE FROM apprenant WHERE PI_ID="+ apprenant.getIdApprenant();
				statement.executeUpdate(sql);
				String nomApprenant = null;
				System.out.println("Suppression de l'apprenant "+ nomApprenant+ " effectuée");
			}
			catch(SQLException e){
				System.out.println("Erreur lors de la suppression du pilote !");
			}
		}
		
	}
	
	/**
	// Affecter 2 activités 
	public static  void addActivity(int a, int b) throws SQLException {
		PreparedStatement prepareStatement = ConnexionDB.getConnexion().prepareStatement("INSERT INTO fait` VALUES( ? , ? )");
		prepareStatement.setInt(1,"fait.getIdActivite");
		prepareStatement.setInt(2,"fait.getIdAppprenant");
		prepareStatement.executeUpdate();
	}
	
	public static int getNombreActivite() throws SQLException
	{
		 ResultSet resultat = ConnexionDB.getConnexion().createStatement().executeQuery("SELECT count(*) FROM activites");
		 resultat.next();
		 return resultat.getInt(1);
	}
	
*/


