package pomNico;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) throws ClassNotFoundException, SQLException{
		
		ConnexionDB.connexion();
		
		
		ArrayList<Apprenant> getAll = Requetes.afficherApprenantNom();
		
		for (Apprenant apprenant : getAll) {
			System.out.println(apprenant.getNomApprenant() + " \t\t" + apprenant.getPrenomApprenant());
		}
		
		//ConnexionDB.closeConnexion();
	}
	
	
}
