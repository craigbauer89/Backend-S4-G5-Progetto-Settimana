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
import com.epicode.gestioneprenotazioni.repository.PrenotazioniRepository;
import com.epicode.gestioneprenotazioni.repository.UtenteRepository;

@Configuration
public class PrenotazioniConfig {
	

	@Autowired
	private UtenteRepository repoUt;

	@Autowired
	private PrenotazioniRepository repoPren;

	@Autowired
	@Qualifier("postazioni")
	Postazioni posta1;
	
	
	@Autowired
	@Qualifier("postazioni2")
	Postazioni posta2;
	
	@Autowired
	@Qualifier("postazioni3")
	Postazioni posta3;
	
	@Autowired
	@Qualifier("postazioni4")
	Postazioni posta4;
	
	@Autowired
	@Qualifier("postazioni5")
	Postazioni posta5;
	
	@Autowired
	@Qualifier("postazioni6")
	Postazioni posta6;


	@Autowired
	ObjectProvider<Prenotazioni> prenotazioniProvider;
	
	@Bean("prenotazioni1")
	@Scope("prototype")
	public Prenotazioni nuovaPrenotazione() {
		return new Prenotazioni();
	}
	
	@Bean("prenotazioni")
	public Utente utentePronotazioni() {
		Prenotazioni prenota1 = prenotazioniProvider.getObject();
		
		prenota1.setPostazione(posta1);
		prenota1.setValido(true);
		repoPren.save(prenota1);
		
		Prenotazioni prenota2 = prenotazioniProvider.getObject();
		prenota2.setPostazione(posta2);
		prenota2.setValido(true);
		repoPren.save(prenota2);
		
		Prenotazioni prenota3 = prenotazioniProvider.getObject();
		prenota3.setPostazione(posta3);
		prenota3.setValido(true);
		repoPren.save(prenota3);
		
		Prenotazioni prenota4 = prenotazioniProvider.getObject();
		prenota4.setPostazione(posta4);
		prenota4.setValido(true);
		repoPren.save(prenota4);
		
		Prenotazioni prenota5 = prenotazioniProvider.getObject();
		prenota5.setPostazione(posta5);
		prenota5.setValido(true);
		repoPren.save(prenota5);

	
		List<Prenotazioni> prenotazioni = new ArrayList<Prenotazioni>();
		
		prenotazioni.add(prenota1);
		prenotazioni.add(prenota2);
		prenotazioni.add(prenota3);
		prenotazioni.add(prenota4);
		prenotazioni.add(prenota5);
		
		Utente utente = Utente.builder()
			
				.nome("Jim Bean")
				.username("jeanbean89")
				.email("jeanbean89@gmail.com")
				.prenotazione(prenotazioni)
				.build();
		repoUt.save(utente);
		return utente;
	
	}
	
	@Bean("prenotazioni2")
	public Utente utentePronotazioni2() {
		Prenotazioni prenota1 = prenotazioniProvider.getObject();
		
		prenota1.setPostazione(posta1);
		prenota1.setValido(true);
		repoPren.save(prenota1);
		
		Prenotazioni prenota2 = prenotazioniProvider.getObject();
		prenota2.setPostazione(posta2);
		prenota2.setValido(true);
		repoPren.save(prenota2);
		
		Prenotazioni prenota3 = prenotazioniProvider.getObject();
		prenota3.setPostazione(posta6);
		prenota3.setValido(true);
		repoPren.save(prenota3);
		
	
		List<Prenotazioni> prenotazioni = new ArrayList<Prenotazioni>();
		
		prenotazioni.add(prenota1);
		prenotazioni.add(prenota2);
		prenotazioni.add(prenota3);
		
		
		Utente utente = Utente.builder()
			
				.nome("Mary McGuinness")
				.username("mmac")
				.email("mmac@yahoo.com")
				.prenotazione(prenotazioni)
				.build();
		repoUt.save(utente);
		return utente;
	
	}
	


}
