package ml.ipsmart.firstApiSoir.entites;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Professeur {

	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	private int matricule;
	private String nom;
	private String prenom;
	private String telephone;
	private String profMatiere;
	private String email;
	
	public Professeur() {
		super();
	}

	public Professeur(int matricule, String nom, String prenom, String telephone, String profMatiere, String email) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.profMatiere = profMatiere;
		this.email = email;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getProfMatiere() {
		return profMatiere;
	}

	public void setProfMatiere(String profMatiere) {
		this.profMatiere = profMatiere;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
