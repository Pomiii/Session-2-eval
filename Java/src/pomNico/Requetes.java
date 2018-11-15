package pomNico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;









public class Requetes {


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

		System.out.println("Nom et Prénom de tous les apprenants");
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
	public static void supprimerApprenant(Apprenant apprenant) throws SQLException
	{
		Statement statement = null;

		try {
			statement = ConnexionDB.getConnexion().createStatement();
			String suppression = "DELETE FROM Apprenant WHERE idApprenant="+apprenant.getIdApprenant();
			statement.executeUpdate(suppression);
			System.out.println("L'apprenant "+ apprenant.getNomApprenant()+ " a été supprimé");
		}
		catch(SQLException e){
			System.out.println("Impossible de supprimer l'apprenant");
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
}

