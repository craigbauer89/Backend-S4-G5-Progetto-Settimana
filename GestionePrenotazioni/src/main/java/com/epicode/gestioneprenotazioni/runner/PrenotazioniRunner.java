package com.epicode.gestioneprenotazioni.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.epicode.gestioneprenotazioni.service.PrenotazioniService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Order(1)
@Slf4j
@AllArgsConstructor
public class PrenotazioniRunner implements ApplicationRunner {

	private PrenotazioniService prenotazioniService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.info("----------Runner:------------");
		prenotazioniService.stampaVideoPrenotazioni();
		
	}

}






