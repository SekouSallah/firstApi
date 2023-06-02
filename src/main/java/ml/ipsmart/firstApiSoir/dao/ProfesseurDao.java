package ml.ipsmart.firstApiSoir.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ml.ipsmart.firstApiSoir.entites.Professeur;

public interface ProfesseurDao extends JpaRepository<Professeur, Integer>{

}
