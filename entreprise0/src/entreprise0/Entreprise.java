package entreprise0;

import java.util.ArrayList;

public class Entreprise 
{
	private String nom;
	private ArrayList<Employes> personnel;
	
	public Entreprise()
	{
		this.setNom(nom);
		this.initEmployes();
	}
	
	public Entreprise(String nom)
	{
		this.setNom(nom);
		this.initEmployes();
		
	}
	
	public void initEmployes()
	{
		this.personnel = new ArrayList<Employes>();
	}
	
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void addEmployes(Employes personnelAjouter)
	{
		this.personnel.add(personnelAjouter);
	}
	
	public void removeEmployes (Employes personnelSupprimer)
	{
		while(this.personnel.remove(personnelSupprimer));
	}
	
	public String toString()
	{
		String liste;
		liste = "";
		liste += this.getNom();
		liste += "\n" + personnel.toString();
		return liste;
	}

}
