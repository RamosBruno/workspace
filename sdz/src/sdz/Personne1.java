package sdz;

import java.util.Scanner;

public class Personne1
{
	private String nom;
	private int annee;
	private int salaire;
	private GestPers personne;
	
	
	public Personne1 ()
	{
		Scanner Saisie = new Scanner(System.in);
		System.out.println("Quel est votre nom ?");
		nom = Saisie.nextLine();
		System.out.println("Quelle est votre année de naissance ?");
		annee = Saisie.nextInt();
		System.out.println("Quel est votre salaire ?");
		salaire = Saisie.nextInt();
	}
	
	public Personne1 (String pNom, int pAnnee, int pSalaire)
	{
		nom = pNom;
		annee = pAnnee;
		salaire = pSalaire;
	}
		
	// Nous avons surchargé le constructeur
	public Personne1 (String Pnom, int Pannee)
	{		
		nom=Pnom;
		annee=Pannee;
		salaire=1200;
	}
	
	public void affiche()
	{
		System.out.println("Votre nom est "+nom);
		System.out.println("Votre annee de naissance est "+annee);
		System.out.println("Votre salaire est de "+salaire);	
	}
	
	public void calcul_age()
	{
		final int ancours=2013;
		int age;
		
		age=ancours-annee;
		System.out.println("Vous avez "+age+" an");		
	}
	
		
}