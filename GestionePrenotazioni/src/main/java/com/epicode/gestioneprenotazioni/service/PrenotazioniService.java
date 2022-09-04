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
	
	@Autowired
	@Qualifier("prenotazioni2")
	private Utente prenotazioni2;
	
	@Autowired
	@Qualifier("prenotazioni3")
	private Utente prenotazioni3;
	

	public Utente creaPrenotazioni() {
		return prenotazioni;
	}
	
	public Utente creaPrenotazioni2() {
		return prenotazioni2;
	}
	
	public Utente creaPrenotazioni3() {
		return prenotazioni3;
	}
	
	
	
	public void stampaVideoPrenotazioni() {
		Utente utente1Prenotazioni  = creaPrenotazioni();
		log.info("-----Prenotazioni delle Utente 1-----------");
		log.info("Prenotazioni *" +utente1Prenotazioni.toString());
		
		log.info("-------------------------------");
		
		
		Utente utente2Prenotazioni  = creaPrenotazioni2();
		log.info("-----Prenotazioni delle Utente 2-----------");
		log.info("Prenotazioni *" +utente2Prenotazioni.toString());
		
		log.info("-------------------------------");
		
		Utente utente3Prenotazioni  = creaPrenotazioni3();
		log.info("-----Prenotazioni delle Utente 2-----------");
		log.info("Prenotazioni *" +utente3Prenotazioni.toString());
		
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
