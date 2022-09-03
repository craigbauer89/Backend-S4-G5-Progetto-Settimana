package com.epicode.gestioneprenotazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.model.Edificio;
import com.epicode.gestioneprenotazioni.model.Postazioni;
import com.epicode.gestioneprenotazioni.model.Prenotazioni;
import com.epicode.gestioneprenotazioni.model.Utente;
import com.epicode.gestioneprenotazioni.repository.EdificioRepository;
import com.epicode.gestioneprenotazioni.repository.PostazioniRepository;
import com.epicode.gestioneprenotazioni.repository.PrenotazioniRepository;
import com.epicode.gestioneprenotazioni.repository.UtenteRepository;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class PrenotazioniService {
	
	
	
//	@Autowired
//	private PostazioniRepository repoPost;
	
	
	
	
	
	
	
	
	@Autowired
	@Qualifier("prenotazioni")
	private Utente prenotazioni;
	
	@Autowired
	@Qualifier("postazioni")
	private Postazioni postazioni;
	
	@Autowired
	@Qualifier("edificio")
	private Edificio edificio;
	
	@Autowired
	@Qualifier("prenotazioni1")
	private Prenotazioni prenotazioni1;
	

	public Utente creaPrenotazioni() {
		return prenotazioni;
	}
	
	
	
	public void stampaVideoPrenotazioni() {
		Utente prenotazioni  = creaPrenotazioni();
		log.info("-----Prenotazioni delle Utente-----------");
		log.info("Prenotazioni *" +prenotazioni.toString());
		
		log.info("-------------------------------");
		
		
//		for(RigaOrdine riga : ordine.getRigheOrdine()){
//			log.info(riga.getVoceDiMenu().getDescrizione()+ " " +riga.getVoceDiMenu() );
//		}
//		log.info("-------------------------------");
//		log.info("Importo Coperti *" +ordine.calcolaCoperti());
//		log.info("Totale Ordine *" +ordine.totaleOrdine());
		
		
		
//		repoPost.findTipo();
		

	}
	
	

}
