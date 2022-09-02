package com.epicode.gestioneprenotazioni.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import com.epicode.gestioneprenotazioni.model.Edificio;
import com.epicode.gestioneprenotazioni.model.Postazioni;
import com.epicode.gestioneprenotazioni.model.Prenotazioni;
import com.epicode.gestioneprenotazioni.model.TipoPostazione;
import com.epicode.gestioneprenotazioni.model.Utente;

@Configuration
public class PrenotazioniConfig {

	

	@Autowired
	@Qualifier("posta1")
	Postazioni posta1;


	@Autowired
	ObjectProvider<Prenotazioni> prenotazioniProvider;
	
	@Bean
	@Scope("prototype")
	public Prenotazioni nuovaPrenotazione() {
		return new Prenotazioni();
	}
	
	@Bean("prenotazioni")
	public Utente utentePronotazioni() {
		Prenotazioni prenota1 = prenotazioniProvider.getObject();
		prenota1.setPostazione(posta1);
		prenota1.setValido(true);
		
//		Prenotazioni prenota2 = prenotazioniProvider.getObject();
//		prenota2.setPostazione(posta1);
//		prenota2.setValido(true);
//		
//		Prenotazioni prenota3 = prenotazioniProvider.getObject();
//		prenota3.setPostazione(posta1);
//		prenota3.setValido(true);
//		
//		Prenotazioni prenota4 = prenotazioniProvider.getObject();
//		prenota4.setPostazione(posta1);
//		prenota4.setValido(true);
	
		List<Prenotazioni> prenotazioni = new ArrayList<Prenotazioni>();
		
		prenotazioni.add(prenota1);
//		prenotazioni.add(prenota2);
//		prenotazioni.add(prenota3);
//		prenotazioni.add(prenota4);
		
		Utente utente = Utente.builder()
				.nome("Jim Bean")
				.username("jeanbean89")
				.email("jeanbean89@gmail.com")
				.prenotazione(prenotazioni)
				.build();
		
		return utente;
	
	}
	


}
