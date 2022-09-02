package com.epicode.gestioneprenotazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.model.Prenotazioni;
import com.epicode.gestioneprenotazioni.model.Utente;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class PrenotazioniService {
	
	@Autowired
	@Qualifier("prenotazioni")
	private Utente prenotazioni;
	

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
		
	}
	
	

}
