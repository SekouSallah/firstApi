package ml.ipsmart.firstApiSoir.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.ipsmart.firstApiSoir.dao.ProfesseurDao;
import ml.ipsmart.firstApiSoir.entites.Professeur;

@Service
public class ProfesseurService {

	@Autowired
	ProfesseurDao pDao;
	
	//ajouter un professeur
	
	public Professeur add(Professeur p) {
		 return pDao.save(p);
	}
	//modifier un professeur
	public Professeur update(Professeur p) {

		boolean bool = pDao.existsById(p.getMatricule());
		if(bool) {
			
			return pDao.save(p);
			
		}else {
			
			return new Professeur();
		}
	}

	
	//supprimer un professeur
	
	//contacter un professeur
	
	//list des profs
	//Donner des moyennes
	//modifier une note
	//

}
