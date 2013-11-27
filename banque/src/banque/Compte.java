package banque;

public class Compte 
{
	private String nom;
	private int numCompte;
	private int soldeCompte;
	
	//constructeur par défaut
	public Compte()
	{
		this.nom="";
		this.numCompte=0;
		this.soldeCompte=0;
	}
	
	//constructeur surcharger
	public Compte(String pNom, int pNumCompte, int pSoldeCompte)
	{
		this.nom=pNom;
		this.numCompte=pNumCompte;
		this.soldeCompte=pSoldeCompte;
	}
	
	//méthode d'affichage
	public void affiche()
	{
			System.out.println(nom+"- "+numCompte+"- "+soldeCompte);
	}
	
	//méthode pour effectuer un dépot 
	public void depot(int pDepot)
	{
		soldeCompte = soldeCompte + pDepot;
	}
	//méthode pour effectuer un retrait
	public void retrait (int pRetrait)
	{
		//on fait la soustraction pour vérifier que le client puisse faire son retrait
		soldeCompte = soldeCompte - pRetrait;
		//si après opération on dépasse les -300€ on recrédite le compte de la somme qu'il voulait retirer
		if (soldeCompte < -300)
		{
			soldeCompte = soldeCompte + pRetrait;
			System.out.println("Retrait impossible, car le solde après retrait est inférieur à 300");
		}
		//sinon le soldeCompte reste le même
		else 
		{
				soldeCompte= soldeCompte;
		}
	}
}
