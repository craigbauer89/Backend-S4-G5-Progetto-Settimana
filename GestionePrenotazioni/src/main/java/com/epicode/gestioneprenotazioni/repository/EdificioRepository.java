package com.epicode.gestioneprenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneprenotazioni.model.Edificio;


@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {

		

	}


