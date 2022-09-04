package com.epicode.gestioneprenotazioni.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import com.epicode.gestioneprenotazioni.model.Edificio;
import com.epicode.gestioneprenotazioni.model.Postazioni;
import com.epicode.gestioneprenotazioni.model.TipoPostazione;
import com.epicode.gestioneprenotazioni.model.Utente;
import com.epicode.gestioneprenotazioni.repository.EdificioRepository;
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
	
	@Autowired
	private EdificioRepository repoEd;

	private PrenotazioniService prenotazioniService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.info("----------Runner:------------");
		prenotazioniService.stampaVideoPrenotazioni();
		
		List<Postazioni> PostazioniCercatoPerCodice= repoPost.findByCodice("AA001");
		
		
		
		System.out.println(PostazioniCercatoPerCodice);
		
List<Postazioni>PostazioniCercatoPerTipo= repoPost.findByTipoPostazione(TipoPostazione.PRIVATO);
		
		
System.out.println("-------------------------------");
		System.out.println("Trova lista Postazioni con tipo:PRIVATO:  " + PostazioniCercatoPerTipo);
		System.out.println("-------------------------------");
		
		List<Edificio> EdificioCercatoPerCitta= repoEd.findByCitta("New York");
		System.out.println("-------------------------------");
		System.out.println(EdificioCercatoPerCitta);
		
		
		List<String> EdificioNomeCercatoPerCitta=repoEd.findNomeByCitta("New York");
		
		System.out.println("-------------------------------");
		System.out.println("Trova nomi dei Edifici a New York: " + EdificioNomeCercatoPerCitta);
		
		for(Postazioni postazioni : PostazioniCercatoPerTipo) {
			if (postazioni.getEdificio().getCitta().equals("New York")) {
				System.out.println("-------------------------------");
				System.out.println("Trova Codice dei Postazioni con tipo:PRIVATO e a New York: " +postazioni.getCodice());
				System.out.println("-------------------------------");
			}
		}
		
		
//List<String> findPostazioneByCittaAndTipo=repoEd.findPostazioneByCittaAndTipo("New York"); //, TipoPostazione.PRIVATO );
//		
//		
//		System.out.println(findPostazioneByCittaAndTipo);
		
		
	}

}






