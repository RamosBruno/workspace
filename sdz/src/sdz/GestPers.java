package sdz;

import java.util.*;

public class GestPers
{
	private Vector macollection;
	
	public GestPers()
	{
		macollection=new Vector();		
	}
	
	public GestPers(int nb)
	{
		macollection=new Vector();		
	}
	
	public void ajoute_pers(int nb)
	{
		for(int i=0; i<nb; i++)
		{
			Personne1 pp=new Personne1();
			macollection.add(pp);						
		}
	}
	public void affiche_pers()
	{
		System.out.println("Voici tous les salaries:");
		Iterator it = macollection.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			Personne1 pp = (Personne1)obj;
			pp.affiche();
		}
	}
	
}