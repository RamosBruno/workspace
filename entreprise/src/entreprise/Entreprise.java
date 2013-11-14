package entreprise;

import java.util.ArrayList;

public class Entreprise {
	String NomEntreprise;
	ArrayList<String> listeEmployes = new ArrayList<String>();

	
	
	public Entreprise()
	{
		NomEntreprise="";
		this.listeEmployes = new ArrayList<String>();
	}
	
	public Entreprise(String pNomEntreprise)
	{
		NomEntreprise="pNomEntreprise";
	}
	
}
