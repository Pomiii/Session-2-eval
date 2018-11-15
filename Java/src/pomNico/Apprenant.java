package pomNico;

/**
 * 
 * @author Nico
 *
 */
public class Apprenant {
	
	
	      
	int idApprenant;
	String nomApprenant;
	String prenomApprenant;
	String dateNaissance; 
	String emailApprenant;
	String photoApprenant;
	int regionApprenant;
	public Apprenant(int idApprenant, String nomApprenant, String prenomApprenant, String dateNaissance,
			String emailApprenant, String photoApprenant, int regionApprenant) {
		super();
		this.idApprenant = idApprenant;
		this.nomApprenant = nomApprenant;
		this.prenomApprenant = prenomApprenant;
		this.dateNaissance = dateNaissance;
		this.emailApprenant = emailApprenant;
		this.photoApprenant = photoApprenant;
		this.regionApprenant = regionApprenant;
	}
	public Apprenant() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdApprenant() {
		return idApprenant;
	}
	public void setIdApprenant(int idApprenant) {
		this.idApprenant = idApprenant;
	}
	public String getNomApprenant() {
		return nomApprenant;
	}
	public void setNomApprenant(String nomApprenant) {
		this.nomApprenant = nomApprenant;
	}
	public String getPrenomApprenant() {
		return prenomApprenant;
	}
	public void setPrenomApprenant(String prenomApprenant) {
		this.prenomApprenant = prenomApprenant;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String date) {
		this.dateNaissance = date;
	}
	public String getEmailApprenant() {
		return emailApprenant;
	}
	public void setEmailApprenant(String emailApprenant) {
		this.emailApprenant = emailApprenant;
	}
	public String getPhotoApprenant() {
		return photoApprenant;
	}
	public void setPhotoApprenant(String string) {
		this.photoApprenant = string;
	}
	public int getRegionApprenant() {
		return regionApprenant;
	}
	public void setRegionApprenant(int regionApprenant) {
		this.regionApprenant = regionApprenant;
	}
	@Override
	public String toString() {
		return ""+ "Apprenant :" +" "+  idApprenant+ " "+ nomApprenant +" "+  prenomApprenant+ " "+ dateNaissance +" "+  emailApprenant
				+ " " + photoApprenant +" "+ regionApprenant + "\n"; 
	}
	
	
	
}
