package ml.ipsmart.firstApiSoir.entites;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Etudiant {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int matricule;
	private String nom;
	private String prenom;
	private String telephone;
	private String filiere;
	private String email;
	private String dateNaissance;
	private Date createDate = new Date();
	

	public Etudiant(int matricule, String nom, String prenom, String telephone, String filiere, String email,
			String dateNaissance, Date createDate) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.filiere = filiere;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.createDate = createDate;
	}
	
	public Etudiant() {
		super();
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

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
