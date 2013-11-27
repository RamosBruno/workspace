public class Employe
{	
	 String Nom;
	 String Prenom;
	 String Poste;
	
	public Employe()
	{
		Nom="";
		Prenom="";
		Poste="";
		
	}
	
	public Employe(String pNom, String pPrenom, String pPoste)
	{
		Nom = pNom;
		Prenom = pPrenom;
		Poste = pPoste;
	}
		
	public void Affiche()
	{
		System.out.print(Nom);
		System.out.print(" " + Prenom + " ");
		System.out.print("au poste : " + Poste);
	}

}