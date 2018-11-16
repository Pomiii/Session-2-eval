package pomNico;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// appel d'ouverture de connexion
		System.out.println("On se connecte à la BDD");
		ConnexionDB.connexion();

		// appeler la methode pour afficher tous les apprenants
		System.out.println("on affiche tous les apprenants");
		tousApprenants();
		attenteEntree();
		attenteEntree();
		// appeler la methode pour afficher ceux de la region IDF
		System.out.println("on affiche les apprenants d'Ile de France");
		regionIDF();
		attenteEntree();
		
		// appeler la methode pour afficher ceux de la region PL
		System.out.println("on affiche les apprenants des Pays de Loire");
		regionPL();
		attenteEntree();
		attenteEntree();

		
		// appeler la methode pour afficher ceux de la region Aq
		System.out.println("On affiche les apprenants d'Aquitaine");
		regionAq();
		attenteEntree();

		// appel methode pour afficher les activites de Nicolas Filine
		System.out.println("on affiche les activités de Nicolas Filine");
		afficherActiviteParNom();
		attenteEntree();
		
		// appel de methode pour afficher les apprenants d'une Activite
		
		System.out.println("afficher les apprenants d'une Activite");
		Requetes.afficherActivitesApp();
		//ArrayList<Apprenant> liste = Requetes.afficherActivitesApp();
		//for (Apprenant apprenant : liste) {
			
		
			//System.out.println(apprenant.getNomApprenant() + "\n");
		//}
		
		attenteEntree();

		// appel de la methode ajouterApprenant (voir sous le Main)
		
		
		System.out.println("On ajoute un apprenant à la table");
		ajouterApprenant();
		attenteEntree();
		
		//on ajoute deux activités à Bebert
		Requetes.ajouterActiviteBebert();
		attenteEntree();
		// appel de methode pour afficher les activités que personne ne fait
		activitesOrphelines();
		// On va modifier Filine
		attenteEntree();
		Requetes.modifierApprenant();
		
		
	
		 
	
	




		System.out.println("On supprime l'apprenant de la table");
		;
		
		Requetes.supprimerApprenant();
		
		// appel de fermeture de connexion
		ConnexionDB.closeConnexion();
	}



	public static void activitesOrphelines() throws ClassNotFoundException, SQLException {
		System.out.println("afficher les activités que personne ne fait");
		ArrayList<Activite> listeOrphelines = Requetes.afficherActiviteSansApprenant();
		for (Activite activite : listeOrphelines) {
			System.out.println(activite.nomActivite + "\n");
		}
	}

	

	public static void afficherActiviteParNom() throws ClassNotFoundException, SQLException {
		ArrayList<Activite> activiteDeLapprenant = Requetes.afficherActivitesApprenant("Filine");
		for (Activite activite : activiteDeLapprenant) {
			System.out.println(activite.getNomActivite() + " " + activite.getIdActivite() + "\n");
		}
	}

	public static void ajouterApprenant() throws SQLException {
		Apprenant nouvelApprenant = new Apprenant((Requetes.getNombreApprenants()+1), "Bebert", "Jerome", "1976-12-10", "bebert.jerome@gmail.com", "photoApprenant", 1);
		

		Requetes.ajouterApprenant(nouvelApprenant);
	}


	
	public static void attenteEntree() {
		System.out.println("APPUYER SUR ENTREE POUR CONTINUER");
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void tousApprenants() throws ClassNotFoundException, SQLException {
		ArrayList<Apprenant> getAll = Requetes.afficherApprenantNom();
		for (Apprenant apprenant : getAll) {
			System.out.println(apprenant.getNomApprenant() + " " + apprenant.getPrenomApprenant());
		}
	}

	public static void regionAq() throws ClassNotFoundException, SQLException {
		ArrayList<Apprenant> getAllbyRegionAq = Requetes.afficherApprenantAq();

		for (Apprenant apprenant : getAllbyRegionAq) {
			System.out.println(apprenant.getNomApprenant() + " \t\t" + apprenant.getPrenomApprenant());
		}
	}

	public static void regionPL() throws ClassNotFoundException, SQLException {
		ArrayList<Apprenant> getAllbyRegionPL = Requetes.afficherApprenantPL();

		for (Apprenant apprenant : getAllbyRegionPL) {
			System.out.println(apprenant.getNomApprenant() + " \t\t" + apprenant.getPrenomApprenant());
		}
		System.out.println();
	}

	public static void regionIDF() throws ClassNotFoundException, SQLException {
		ArrayList<Apprenant> getAllbyRegionIDF = Requetes.afficherApprenantIDF();

		for (Apprenant apprenant : getAllbyRegionIDF) {
			System.out.println(apprenant.getNomApprenant() + " \t\t" + apprenant.getPrenomApprenant());
		}

		System.out.println();
	}

	/**
	 * 
	 * // méthode pour modifier le nom public static void majNom() throws
	 * SQLException { Apprenant nomApprenant = new Apprenant();
	 * 
	 * nomApprenant.setNomApprenant("Raffarin");
	 * 
	 * Requetes.updApprenant(nomApprenant); } /** // méthode pour supprimer un
	 * Apprenant public static void supApprenant() throws SQLException { Apprenant
	 * apprenant = new Apprenant();
	 * 
	 * apprenant.getIdApprenant();
	 * 
	 * Requetes.rmvApprenant(17); }
	 * 
	 * // affecter 2 activités public static void AddActivite() throws SQLException
	 * { Activite nvlActivite = new Activite(0, null);
	 * 
	 * nvlActivite.setIdActivite(getNombreActivite()+1);
	 * nvlActivite.setNomActivite("Caresser le chat");
	 * 
	 * Requetes.addActivity(); }
	 **/
}
