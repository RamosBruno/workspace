import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		//d�claration des variables
		String Nom="",Prenom="", Poste="", Rep;
		int nb;
		Scanner scan = new Scanner(System.in);
		//D�claration de l'array qui va sauvegarder les employ�s
		ArrayList <Employe> Al = new ArrayList<Employe>();
			
		System.out.println("Que voulez-vous faire ? AJ, AF, S, F");
		Rep = scan.nextLine();
		//v�rification de la saisie 
		while (!Rep.equals("AJ") && !Rep.equals("AF") && !Rep.equals("S") && !Rep.equals("F"))
		{
			System.out.println("Que voulez-vous faire ? AJ, AF, S, F");
			Rep = scan.nextLine();
		}
		//tant que l'utilisateur n'a pas saisie F on va lui demander de faire quelque chose
		while (!Rep.equals("F"))
		{
			//option d'ajout d'employer
			if (Rep.equals("AJ"))
			{
				System.out.println("Quel nom ?");
				Nom = scan.nextLine();
				
				System.out.println("Quel pr�nom ?");
				Prenom = scan.nextLine();
				
				System.out.println("Quel poste ?");
				Poste = scan.nextLine();
				
				Employe Ajoute = new Employe(Nom, Prenom, Poste);
				Al.add(new Employe(Nom, Prenom, Poste));
			}
			//option d'affichage
			else if (Rep.equals("AF"))
			{
				//boucle qui va nous permettre de r�cup�rer le rang de l'employer dans l'arraylist pour facilit� la suppression
				for(int i = 0; i < Al.size(); i++)
				{
					System.out.print("L'employ� au rang " + i + " est : " );
					Al.get(i).Affiche();
					System.out.println();
				}
			}
			//option de suppression
			else if (Rep.equals("S"))
			{
				for(int i = 0; i < Al.size(); i++)
				{
					System.out.print("L'employ� au rang " + i + " est : " );
					Al.get(i).Affiche();
					System.out.println();
				}
				
				System.out.println("Qui voulez-vous supprimer ? (Saisissez son rang)");
				nb = scan.nextInt();
				Al.remove(nb);
				
				for(int i = 0; i < Al.size(); i++)
				{
					System.out.print("L'employ� au rang " + i + " est : " );
					Al.get(i).Affiche();
					System.out.println();
				}
				/* Sans cette ligne, le programme affiche la demande pour la prochaine saisie,
				 * mais passe directement dans le Tant que comme s'il avait enregistr�
				 * une mauvaise saisie.*/
				Rep = scan.nextLine();
			}
			
			
			System.out.println("Que voulez-vous faire ? AJ, AF, S, F");
			Rep = scan.nextLine();
			
			while (!Rep.equals("AJ") && !Rep.equals("AF") && !Rep.equals("S") && !Rep.equals("F"))
			{
				System.out.println("Que voulez-vous faire ? AJ, AF, S, F OOOOO");
				Rep = scan.nextLine();
			}
		}
	
		for(int i = 0; i < Al.size(); i++)
		{
			System.out.print("L'employ� au rang " + i + " est : " );
			Al.get(i).Affiche();
			System.out.println();
		}
	}
}