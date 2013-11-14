package entreprise;

public class Employes {
	String Nom;
	String Prenom;
	String Poste;

	
	public Employes()
	{
		Nom="";
		Prenom="";
		Poste="";
	}
	
	public Employes(String pNom,String pPrenom,String pPoste)
	{
		Nom=pNom;
		Prenom=pPrenom;
		Poste=pPoste;
		System.out.println("Vous avez ajouter : "+Nom+" "+Prenom+" qui a pour poste : "+Poste);
	}
	
	
}
