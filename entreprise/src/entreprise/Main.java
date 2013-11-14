package entreprise;

import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	public static void main (String args[])
	{
		String Reponse,Nom,Prenom,Poste, total;
		int i;
		Scanner Saisie = new Scanner(System.in);
		ArrayList listeEmployer = new ArrayList();
		
		System.out.println("Que voulez-vous faire ? AJ pour ajouter, S pour supprimer, AF pour afficher.");
		Reponse = Saisie.nextLine();
		
		while (!(Reponse.equalsIgnoreCase("AJ")) && (!(Reponse.equalsIgnoreCase("S"))) && (!(Reponse.equalsIgnoreCase("AF"))) )
		{
			System.out.println("Vous devez choisir entre : AJ pour ajouter, S pour supprimer, AF pour afficher.");
			Reponse = Saisie.nextLine();
		}
		
		if (Reponse.equalsIgnoreCase("AJ"))
		{
			while (Reponse.equalsIgnoreCase("AJ"))
			{
				System.out.println("Quel nom ?");
				Nom = Saisie.nextLine();
				System.out.println("Quel prénom ?");
				Prenom = Saisie.nextLine();
				System.out.println("Quel poste ?");
				Poste = Saisie.nextLine();
				System.out.println("Que voulez-vous faire ? AJ pour ajouter, S pour supprimer, AF pour afficher");
				Reponse = Saisie.nextLine();
				Employes ajout = new Employes(Nom,Prenom,Poste);
			}
			
		}
		
		else if (Reponse.equalsIgnoreCase("S"))
		{
			System.out.println("C'est S !!!");
		}
		
		else
		{
			System.out.println("C'est AF !!!");
		}
		
		
		
	                 
	    
		
		
	}
}
