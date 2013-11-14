package sdz;

import java.util.Scanner;

public class Utilise_Personne1
{
	public static void main (String ARGS[])
	{
		GestPers personnes = new GestPers();
		Personne1 p1, p2, p3;
		Scanner Saisie = new Scanner(System.in);
		int nb;
		
		p1=new Personne1("Dupont", 1975, 1500);
		
		p1.affiche();
		p1.calcul_age();
		
		p2=new Personne1("Mercier", 1990, 2300);
		
		p2.affiche();
		p2.calcul_age();
		
		p3=new Personne1("Martin", 1985);
		
		p3.affiche();
		p3.calcul_age();
		
		System.out.println("Combien de personnes voulez-vous ajouter ?");
		nb= Saisie.nextInt();
		personnes.ajoute_pers(nb);
		personnes.affiche_pers();
		
		
	}
}