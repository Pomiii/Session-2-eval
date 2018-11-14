package pomNico;

public class Activite {
	int idActivite;
	String nomActivite;
	

	public Activite(int idActivite, String nomActivite){
		this.idActivite = idActivite;
		this.nomActivite = nomActivite;
	}
	public int getIdActivite() {
		return idActivite;
	}

	public void setIdActivite(int idActivite) {
		this.idActivite = idActivite;
	}

	public String getNomActivite() {
		return nomActivite;
	}

	public void setNomActivite(String nomActivite) {
		this.nomActivite = nomActivite;
	}
	@Override
	public String toString() {
		return "Activite [idActivite=" + idActivite + ", nomActivite=" + nomActivite + "]";
	}
	

}
