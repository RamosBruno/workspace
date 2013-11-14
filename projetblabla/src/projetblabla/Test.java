package projetblabla;

import java.util.Scanner;

public class Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int c1,c2,c3,c4;

		
		Scanner saisie = new Scanner (System.in);
		
		System.out.println("Entrer le score en %  du premier candidat");
		c1 = saisie.nextInt();
		
		System.out.println("Entrer le score en %  du deuxieme candidat");
		c2 = saisie.nextInt();
		
		System.out.println("Entrer le score en %  du troisieme candidat");
		c3 = saisie.nextInt();
		
		System.out.println("Entrer le score en %  du quatrieme candidat");
		c4 = saisie.nextInt();
		
		{
			if (c1>50)
			{
				System.out.println("Vous etes elus");
			}
			
				else if (c1<12.5)
				
				{
					System.out.println("Vous etes battus");
				}
			
			   else if ((c1<=50) && (c1>=12.5) && (c1>c2) && (c1>c3) && (c1>c4))
		    
		    	{
		    		System.out.println("Vous etes en ballotage favorable");
		    	}
		    
		    	else  System.out.println("Vous etes defavorable");
		    	
		    		
		           
				
		 }
	}
	

}
