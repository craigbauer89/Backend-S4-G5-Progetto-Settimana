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
import com.epicode.gestioneprenotazioni.repository.EdificioRepository;
import com.epicode.gestioneprenotazioni.repository.PostazioniRepository;

@Configuration
public class PostazioniConfig {
	
//	@Autowired
//	@Qualifier("theManhattan")
//	Edificio theManhattan;
	
	@Autowired
	private PostazioniRepository repoPost;
	
	@Autowired
	private EdificioRepository repoEd;
	
	
	@Autowired
	ObjectProvider<Edificio> edificioProvider;
	
	@Bean("edificio")
	@Scope("prototype")
	public Edificio nuovaEdificio() {
		return new Edificio();
	}

	
	@Bean("postazioni")
	public Postazioni postazioniEdificio() {
		Edificio edificio1 = edificioProvider.getObject();
		
		edificio1.setAddress("122 Park Avenue");
		edificio1.setCitta("New York");
		edificio1.setNome("The Manhattan");
		repoEd.save(edificio1);
	

//	@Bean("posta1")
//	@Scope("prototype")
//	public Postazioni postazione1() {
//		return new Postazioni(TipoPostazione.PRIVATO, "AA001","Panoramic Hudson view", 30, theManhattan, true);
//	}
	
//	List<Edificio> edifici = new ArrayList<Edificio>();
//	
//	edifici.add(edificio1);
	
	Postazioni postazioni = Postazioni.builder()
			.tipoPostazione(TipoPostazione.PRIVATO)
			.codice("AA001")
			.descrizione("Panoramic Hudson view")
			.numeroMassimo(30)
			.libero(true)
			.edificio(edificio1)
			.build();
	repoPost.save(postazioni);
			
	
	return postazioni;
	
}
	
}
