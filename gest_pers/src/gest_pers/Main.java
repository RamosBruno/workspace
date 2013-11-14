package gest_pers;

// Dans le main, on crée les objets et les utilises
public class Main
{
	public static void main(String[] args)
	{
		// On instancie l'objet
		Personnes pers1 = new Personnes("Tata", 1985, 5642);
		
		pers1.Affiche();
		pers1.CalculAge();
		
		Personnes pers2 = new Personnes("Tutu", 1854, 15478);
		
		pers2.Affiche();
		pers2.CalculAge();
		
		Personnes pers3 = new Personnes("Toto", 1785);
		
		pers3.Affiche();
		pers3.CalculAge();
	}

}
