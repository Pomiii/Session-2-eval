package pomNico;
/**
 * 
 * @author Nico
 *
 */


public class Region {
int idRegion;
String nomRegion;
public Region(int idRegion, String nomRegion) {
	super();
	this.idRegion = idRegion;
	this.nomRegion = nomRegion;
}
public int getIdRegion() {
	return idRegion;
}
public void setIdRegion(int idRegion) {
	this.idRegion = idRegion;
}
public String getNomRegion() {
	return nomRegion;
}
public void setNomRegion(String nomRegion) {
	this.nomRegion = nomRegion;
}
@Override
public String toString() {
	return ""+ "Region :" + " " + idRegion + " " + nomRegion; 
}

}
