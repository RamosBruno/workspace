package projetblabla;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   	  int h,min;
	   	  Scanner saisie = new Scanner(System.in);
	   	  
	   	  System.out.println("Entrer l'heure");
		  h=saisie.nextInt();
		  
		  System.out.println("Entrer les minutes");
		  min=saisie.nextInt();
		  
		  if (min==59) 
		  
		 	 {
			  	if (h==23)
			  	{
			  		h=0;
			  		min=0;
		  	
		  	  	}
		  
		 		 else
		 		{
		 			  h=h+1;	  
		  			  min=00;
		        }
		     }
		  
		  
		   else   min=min+1;
		  
		  System.out.println("Dans une minute il sera " +h+"H" +min);
	}

}
