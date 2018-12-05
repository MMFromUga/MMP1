package fr.uga.projet1.expressionLambda;

public class Etudiant {
	public Etudiant(String nom, String prenom, Double i) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.moyenne = i;
	}
	private String nom;
	private String prenom;
	private Double moyenne;
	
	public String getMention() {
		if (moyenne < 10) return "Recal"; 
		else if ((moyenne >= 10) && (moyenne<12)) return "Passable";
		else if ((moyenne >= 12) && (moyenne<14)) return "assez bien";
		else if (moyenne >= 14) return "Bien";
		return nom;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(Double moyenne) {
		this.moyenne = moyenne;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", moyenne=" + moyenne + "]";
	}


}
