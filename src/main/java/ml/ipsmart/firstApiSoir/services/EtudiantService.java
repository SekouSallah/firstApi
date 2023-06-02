package ml.ipsmart.firstApiSoir.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.ipsmart.firstApiSoir.dao.EtudiantDao;
import ml.ipsmart.firstApiSoir.entites.Etudiant;
@Service
public class EtudiantService {

	@Autowired
	EtudiantDao eDao;
	public Etudiant createStudent(Etudiant e) {
		
		return eDao.save(e);
	}
	public List <Etudiant> listStudent(){
		return eDao.findAll();
	}
	public Etudiant updateStudent(Etudiant e) {
		boolean response = eDao.existsById(e.getMatricule());
		if(response) {
			return eDao.save(e);
		}else {
			System.out.println("Student not found");
			return new Etudiant();
		}
	}
	public String deleteStudent(int id) {
		boolean response = eDao.existsById(id);
		if(response) {
			
			eDao.deleteById(id);
			return "Delete successfully !";
		}else {
			String message="" ;
			return message = String.format("Student with %d as Matricule not found", id);
			
			//System.out.println(message);
		}
		
	
	}
	/*public Optional <Etudiant> showStudent(int id){
		boolean answer = eDao.existsById(id);
		if(answer) {
			return eDao.findById(id);
		}else {
			return new Etudiant();
		}
		
	}*/
	public Optional <Etudiant> afficherEtudiant(int id) {
		boolean response = eDao.existsById(id);
		if(response){
			return eDao.findById(id);
		}else {
			return Optional.ofNullable(new Etudiant());
		}
		
		
	}
}
