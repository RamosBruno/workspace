package entreprise0;

public class Employes {
	private String nom;
	private String prenom;
	private String poste;
	private int nbEmp;
	
	public Employes()
	{
		nom="";
		prenom="";
		poste="";
		nbEmp=0;
		
	}
	
	public Employes(String pNom, String pPrenom, String pPoste,int pNbEmp)
	{
		this.setEmployes(pNom,pPrenom,pPoste,pNbEmp);
	}
	
	public void setEmployes(String pNom, String pPrenom, String pPoste, int pNbEmp)
	{
		this.nom=pNom;
		this.prenom=pPrenom;
		this.poste=pPoste;
		this.nbEmp=pNbEmp-1;
	}
	
	public String getEmployes()
	{
		return this.nom+" "+this.prenom+" "+this.poste+" "+this.nbEmp+" ";
	}
	
	public String toString()
	{
		String liste;
		liste = "";
		liste += this.getEmployes();
		return liste;
	}
}
