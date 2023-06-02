package ml.ipsmart.firstApiSoir.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ml.ipsmart.firstApiSoir.entites.Etudiant;
import ml.ipsmart.firstApiSoir.services.EtudiantService;
@RestController
@RequestMapping("/etudiants")
public class EtudiantApi {

	@Autowired
	EtudiantService eS;
	@PostMapping("/add")
	public Etudiant add(@RequestBody Etudiant e) {
		return eS.createStudent(e);
	}
	@PostMapping("/update")
	public Etudiant update(@RequestBody Etudiant e) {
		return eS.updateStudent(e);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
		return eS.deleteStudent(id);
		
	}
	@GetMapping("/list")
	public List <Etudiant> listStudent(){
		return eS.listStudent();
	}
	/*@PostMapping("/show")
	public Etudiant list(@RequestBody Etudiant e){
		return eS.showStudent(e);
	
	}*/	
	@GetMapping("/afficher")
	public Optional <Etudiant> afficher(@RequestParam int id){
		return eS.afficherEtudiant(id);
		
	}
}
