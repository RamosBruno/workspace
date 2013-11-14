package gest_pers;

public class Personnes
{
	// Variables de la classe
	private String Nom;
	private int Annee;
	private int Salaire;
	
	// Constructeur par d�faut
	public Personnes()
	{
		Nom = "";
		Annee = 0;
		Salaire = 0;
	}
	
	// Constructeur en attente de param�tres
	public Personnes(String pNom, int pAnnee, int pSalaire)
	{
		Nom = pNom;
		Annee = pAnnee;
		Salaire = pSalaire;
	}
	
	// Constructeur surcharg�
		public Personnes(String pNom, int pAnnee)
		{
			Nom = pNom;
			Annee = pAnnee;
			Salaire = 1200;
		}
	
	// M�thodes
	public void Affiche()
	{
		System.out.println(Nom + " est n� en " + Annee + " et gagne " + Salaire);
	}
	
	public void CalculAge()
	{
		final int AnneeActuelle = 2013;
		int Age;
		
		Age = AnneeActuelle - Annee;
		System.out.println("Vous avez " + Age + " ans");
	}
}
