package com.epicode.gestioneprenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import com.epicode.gestioneprenotazioni.model.Postazioni;
import com.epicode.gestioneprenotazioni.model.TipoPostazione;
import com.epicode.gestioneprenotazioni.model.Utente;
import com.epicode.gestioneprenotazioni.repository.PostazioniRepository;
import com.epicode.gestioneprenotazioni.service.PrenotazioniService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Order(1)
@Slf4j
@AllArgsConstructor
public class PrenotazioniRunner implements ApplicationRunner {
	
	
	@Autowired
	private PostazioniRepository repoPost;

	private PrenotazioniService prenotazioniService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.info("----------Runner:------------");
		prenotazioniService.stampaVideoPrenotazioni();
		
		Postazioni PostazioniCercatoPerCodice= repoPost.findByCodice("AA001");
		
		
		
		System.out.println(PostazioniCercatoPerCodice);
		
Postazioni PostazioniCercatoPerTipo= repoPost.findByTipoPostazione(TipoPostazione.PRIVATO);
		
		
		
		System.out.println(PostazioniCercatoPerTipo);
		
		
	}

}






