package pomNico;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class mainTest {
	
	static Scanner saisie = new Scanner(System.in);

	public static void main(String[] args) {
		
		
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
		
		afficherActivitesApp();
	}
		
	
	public static ArrayList<Activite> afficherActivitesApp() throws ClassNotFoundException, SQLException {
		
		ArrayList<Apprenant> listeActivitesParApp = new ArrayList<Apprenant>();
	
		int nActivite;
		String requete	= "SELECT * FROM apprenant INNER JOIN fait ON apprenant.idApprenant = fait.idApprenant INNER JOIN activites ON activites.idActivite = fait.idActivite WHERE Activites.idActivite=" + nActivite;
		
		ResultSet resultat = ConnexionDB.executerQuery(requete);
		
		Apprenant apprenant = new Apprenant();
		while(resultat.next())
		{				
			apprenant.setIdApprenant(resultat.getInt("apprenant.IdApprenant"));
			apprenant.setNomApprenant(resultat.getString("activites.nomActivite"));
			listeActivitesParApp.add(apprenant);
			
		}
	
		System.out.println("Tableau des Apprenant pour "+ activite.getNomActivite());
		return ;
	}
		
}
