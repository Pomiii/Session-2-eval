package pomNico;

import java.sql.Blob;
import java.sql.Time;
/**
 * 
 * @author Nico
 *
 */
public class Apprenant {
	int idApprenant;
	String nomApprenant;
	String prenomApprenant;
	Time dateNaissance;
	String emailApprenant;
	Blob photoApprenant;
	public Apprenant(int idApprenant, String nomApprenant, String prenomApprenant, Time dateNaissance,
			String emailApprenant, Blob photoApprenant) {
		super();
		this.idApprenant = idApprenant;
		this.nomApprenant = nomApprenant;
		this.prenomApprenant = prenomApprenant;
		this.dateNaissance = dateNaissance;
		this.emailApprenant = emailApprenant;
		this.photoApprenant = photoApprenant;
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
	public Time getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Time dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmailApprenant() {
		return emailApprenant;
	}
	public void setEmailApprenant(String emailApprenant) {
		this.emailApprenant = emailApprenant;
	}
	public Blob getPhotoApprenant() {
		return photoApprenant;
	}
	public void setPhotoApprenant(Blob photoApprenant) {
		this.photoApprenant = photoApprenant;
	}
	@Override
	public String toString() {
		return ""+ "Apprenant :" +" "+  idApprenant+ " "+ nomApprenant +" "+  prenomApprenant+ " "+ dateNaissance +" "+  emailApprenant
				+ " " + photoApprenant ; 
	}
	
	
	
}
