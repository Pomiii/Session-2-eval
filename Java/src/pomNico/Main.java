package pomNico;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) throws ClassNotFoundException, SQLException{

		//appel d'ouverture de connexion
		ConnexionDB.connexion();
		
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
		
		//appel de fermeture de connexion
		ConnexionDB.closeConnexion();
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


}
