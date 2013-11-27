package banque;

public class Compte 
{
	private String nom;
	private int numCompte;
	private int soldeCompte;
	
	//constructeur par d�faut
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
	
	//m�thode d'affichage
	public void affiche()
	{
			System.out.println(nom+"- "+numCompte+"- "+soldeCompte);
	}
	
	//m�thode pour effectuer un d�pot 
	public void depot(int pDepot)
	{
		soldeCompte = soldeCompte + pDepot;
	}
	//m�thode pour effectuer un retrait
	public void retrait (int pRetrait)
	{
		//on fait la soustraction pour v�rifier que le client puisse faire son retrait
		soldeCompte = soldeCompte - pRetrait;
		//si apr�s op�ration on d�passe les -300� on recr�dite le compte de la somme qu'il voulait retirer
		if (soldeCompte < -300)
		{
			soldeCompte = soldeCompte + pRetrait;
			System.out.println("Retrait impossible, car le solde apr�s retrait est inf�rieur � 300");
		}
		//sinon le soldeCompte reste le m�me
		else 
		{
				soldeCompte= soldeCompte;
		}
	}
}
