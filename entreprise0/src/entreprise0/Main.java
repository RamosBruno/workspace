package entreprise0;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Entreprise societe;
		String entreprise,Reponse,Nom,Prenom,Poste;
		Scanner saisie = new Scanner(System.in);
		
		
		System.out.println("Veuillez Saisir le nom de votre Entreprise");
		entreprise = saisie.nextLine();
		societe = new Entreprise(entreprise);
		System.out.println("Bonjour "+entreprise+" pour ajouter un utilisateur vous devez taper AJ supprimer S et pour afficher il suffit de faire AF.");
		Reponse = saisie.nextLine();
		
		while (!(Reponse.equalsIgnoreCase("AJ")) && (!(Reponse.equalsIgnoreCase("S"))) && (!(Reponse.equalsIgnoreCase("AF"))) )
		{
			System.out.println("Vous devez choisir entre : AJ pour ajouter, S pour supprimer, AF pour afficher.");
			Reponse = saisie.nextLine();
		}
		
		if (Reponse.equalsIgnoreCase("AJ"))
		{
			while (Reponse.equalsIgnoreCase("AJ"))
			{	
				System.out.println("Quel nom ?");
				Nom = saisie.nextLine();
				System.out.println("Quel prénom ?");
				Prenom = saisie.nextLine();
				System.out.println("Quel poste ?");
				Poste = saisie.nextLine();
				Employes ajout = new Employes(Nom,Prenom,Poste);
				societe.addEmployes(ajout);
				System.out.println("Que voulez-vous faire maintenant ? (AJ: pour ajouter,AF : pour afficher,S pour Supprimer )");
				Reponse = saisie.nextLine();
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

		System.out.println(societe);
		
		

	}

}
