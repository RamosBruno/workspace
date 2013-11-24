package banque;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner saisie = new Scanner(System.in);
		int somme;
		
		//1er client
		Compte bob = new Compte("Dupond",1234,450);
		bob.affiche();
		System.out.println("Combien voulez-vous déposer ?");
		somme = saisie.nextInt();
		bob.depot(somme);
		bob.affiche();
		System.out.println("Combien voulez-vous retirer ?");
		somme = saisie.nextInt();
		bob.retrait(somme);
		bob.affiche();
		
		//2eme client
		System.out.println();
		Compte jean = new Compte("Martin",4567,150);
		jean.affiche();
		System.out.println("Combien voulez-vous déposer ?");
		somme = saisie.nextInt();
		jean.depot(somme);
		jean.affiche();
		System.out.println("Combien voulez-vous retirer ?");
		somme = saisie.nextInt();
		jean.retrait(somme);
		jean.affiche();
	}

}