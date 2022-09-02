package com.epicode.gestioneprenotazioni.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestioneprenotazioni.model.Edificio;
import com.epicode.gestioneprenotazioni.model.Postazioni;
import com.epicode.gestioneprenotazioni.model.TipoPostazione;

@Configuration
public class PostazioniConfig {
	
	@Autowired
	@Qualifier("theManhattan")
	Edificio theManhattan;

	@Bean("posta1")
	@Scope("singleton")
	public Postazioni postazione1() {
		return new Postazioni(TipoPostazione.PRIVATO, "AA001","Panoramic Hudson view", 30, theManhattan, true);
	}

}
