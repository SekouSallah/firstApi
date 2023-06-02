package ml.ipsmart.firstApiSoir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ml.ipsmart.firstApiSoir.entites.Professeur;
import ml.ipsmart.firstApiSoir.services.ProfesseurService;
@RequestMapping("/professeur")
@RestController
public class ProfesseurApi {
	@Autowired
	ProfesseurService pS;
	
	@PostMapping("/") 
	public Professeur add(@RequestBody Professeur p) {
		
		return pS.add(p);
	}
	@PostMapping("/modifier")
	public Professeur update(Professeur p) {
		return pS.update(p);
	}
	
}
