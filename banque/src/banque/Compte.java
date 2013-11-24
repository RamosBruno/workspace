package banque;

public class Compte 
{
	private String nom;
	private int numCompte;
	private int soldeCompte;
	
	public Compte()
	{
		this.nom="";
		this.numCompte=0;
		this.soldeCompte=0;
	}
	
	public Compte(String pNom, int pNumCompte, int pSoldeCompte)
	{
		this.nom=pNom;
		this.numCompte=pNumCompte;
		this.soldeCompte=pSoldeCompte;
	}
	
	public void affiche()
	{
			System.out.println(nom+"- "+numCompte+"- "+soldeCompte);
	}
	
	public void depot(int pDepot)
	{
		soldeCompte = soldeCompte + pDepot;
	}
	
	public void retrait (int pRetrait)
	{
		soldeCompte = soldeCompte - pRetrait;
		if (soldeCompte < -300)
		{
			soldeCompte = soldeCompte + pRetrait;
			System.out.println("Retrait impossible, car le solde après retrait est inférieur à 300");
		}
		else 
		{
				soldeCompte= soldeCompte;
		}
	}
}
