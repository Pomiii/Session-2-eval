package pomNico;

import java.sql.Date;
/**
 * 
 * @author Nico
 *
 */
public class Apprenant {
	int idApprenant;
	String nomApprenant;
	String prenomApprenant;
	Date dateNaissance;
	String emailApprenant;
	String photoApprenant;
	public Apprenant(int idApprenant, String nomApprenant, String prenomApprenant, Date dateNaissance,
			String emailApprenant, String photoApprenant) {
		super();
		this.idApprenant = idApprenant;
		this.nomApprenant = nomApprenant;
		this.prenomApprenant = prenomApprenant;
		this.dateNaissance = dateNaissance;
		this.emailApprenant = emailApprenant;
		this.photoApprenant = photoApprenant;
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date date) {
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
	@Override
	public String toString() {
		return ""+ "Apprenant :" +" "+  idApprenant+ " "+ nomApprenant +" "+  prenomApprenant+ " "+ dateNaissance +" "+  emailApprenant
				+ " " + photoApprenant + "\n"; 
	}
	
	
	
}
