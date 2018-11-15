package pomNico;

import java.sql.SQLException;
import java.util.ArrayList;




public class Main {
	public static void main (String[] args) throws ClassNotFoundException, SQLException{

		
	 
		
		
		
		
		//appel d'ouverture de connexion
		ConnexionDB.connexion();
		
		//majNom();
		
		
		// appel methode pour afficher les activites de Nicolas Filine
		afficherActiviteParNom();
		attenteEntree();

		
		//appeler la methode pour afficher tous les apprenants
		tousApprenants();
		attenteEntree();
		
		//appeler la methode pour afficher ceux de la region IDF
		regionIDF();
		attenteEntree();
		
		//appeler la methode pour afficher ceux de la region PL
		regionPL();
		attenteEntree();
		
		//appeler la methode pour afficher ceux de la region Aq
		regionAq();
		
		
		
		
// appel de la methode ajouterApprenant (voir sous le Main)
		attenteEntree();
		ajouterApprenant();
		
		//appel de fermeture de connexion
		ConnexionDB.closeConnexion();
	}

	public static void afficherActiviteParNom() throws ClassNotFoundException, SQLException {
		ArrayList<Activite> activiteDeLapprenant =  Requetes.afficherActivitesApprenant("Filine");
		 for (Activite activite : activiteDeLapprenant) {
			System.out.println(activite.getNomActivite() + " " + activite.getIdActivite() + "\n");
		}
	}

	public static void ajouterApprenant() throws SQLException {
		Apprenant nouvelApprenant = new Apprenant();
		nouvelApprenant.setIdApprenant(Requetes.getNombreApprenants()+1);
		nouvelApprenant.setNomApprenant("Rossi");
		nouvelApprenant.setPrenomApprenant("Valentin");
		nouvelApprenant.setDateNaissance("1976-12-12");
		nouvelApprenant.setEmailApprenant("Rossi.Valentin@gmail.com");
		nouvelApprenant.setPhotoApprenant("url photo");
		nouvelApprenant.setRegionApprenant(1);

		
		Requetes.ajouterApprenant(nouvelApprenant);
	}

	public static void attenteEntree() {
		System.out.println("APPUYER SUR ENTREE POUR CONTINUER");
		try{       
			System.in.read();
		}
		catch(Exception e){
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
	
	// méthode pour modifier le nom
		public static void majNom() throws SQLException {
			Apprenant nomApprenant = new Apprenant();
			
			nomApprenant.setNomApprenant("Raffarin");
			
		Requetes.updApprenant(nomApprenant);
		}
		/**
		// méthode pour supprimer un Apprenant
		public static void supApprenant() throws SQLException {
			Apprenant apprenant = new Apprenant();
			
			apprenant.getIdApprenant();
			
			Requetes.rmvApprenant(17);
		}
		
		// affecter 2 activités
		public static void AddActivite() throws SQLException {
			Activite nvlActivite = new Activite(0, null);
			
			nvlActivite.setIdActivite(getNombreActivite()+1);
			nvlActivite.setNomActivite("Caresser le chat");
			
			Requetes.addActivity();
		}
**/
}
