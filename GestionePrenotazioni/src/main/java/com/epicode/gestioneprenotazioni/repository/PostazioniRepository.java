package com.epicode.gestioneprenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.epicode.gestioneprenotazioni.model.Postazioni;
import com.epicode.gestioneprenotazioni.model.TipoPostazione;



@Repository
public interface PostazioniRepository extends JpaRepository<Postazioni, String> {

	public Postazioni findByCodice(String codice);
	public Postazioni findByTipoPostazione(TipoPostazione tipoPostazione);
	
//		
//@Query("FROM Postazioni WHERE descrizione in ('Panoromic Hudson View')")
//public List<Postazioni> findTipo();
	}