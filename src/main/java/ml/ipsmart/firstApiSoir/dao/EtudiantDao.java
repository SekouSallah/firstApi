package ml.ipsmart.firstApiSoir.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ml.ipsmart.firstApiSoir.entites.Etudiant;

public interface EtudiantDao extends JpaRepository<Etudiant, Integer>{

}
