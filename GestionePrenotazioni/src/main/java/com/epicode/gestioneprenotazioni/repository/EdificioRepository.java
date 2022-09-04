package com.epicode.gestioneprenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneprenotazioni.model.Edificio;


@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {

		
	public List<Edificio> findByCitta(String citta);
	
	
	@Query("SELECT nome FROM Edificio WHERE citta = :citta")
	public List<String> findNomeByCitta(String citta);
	

	
//	@Query("SELECT codice FROM Postazioni WHERE citta IN(SELECT nome FROM Edificio WHERE citta = :citta) AND tipoPostazione = :tipoPostazione")
//	public List<String> findPostazioneByCittaAndTipo(String citta);
	
	}


