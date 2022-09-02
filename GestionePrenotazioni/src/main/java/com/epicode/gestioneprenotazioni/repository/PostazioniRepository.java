package com.epicode.gestioneprenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneprenotazioni.model.Postazioni;



@Repository
public interface PostazioniRepository extends JpaRepository<Postazioni, String> {

		

	}