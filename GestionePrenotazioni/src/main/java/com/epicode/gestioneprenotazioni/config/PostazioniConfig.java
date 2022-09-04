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
	
	
	
	@Bean("postazioni2")
	public Postazioni postazioniEdificio2() {
	
		
Edificio edificio2 = edificioProvider.getObject();
		
		edificio2.setAddress("538 2nd Avenue");
		edificio2.setCitta("New York");
		edificio2.setNome("Global Services Tower");
		repoEd.save(edificio2);
		

	Postazioni postazioni = Postazioni.builder()
			.tipoPostazione(TipoPostazione.SALA_RIUNIONI)
			.codice("AA002")
			.descrizione("The Penthouse Suite Meeting Centre")
			.numeroMassimo(55)
			.libero(true)
			.edificio(edificio2)
			.build();
	repoPost.save(postazioni);
			
	
	return postazioni;
	
}
	
	@Bean("postazioni3")
	public Postazioni postazioniEdificio3() {
	
		
		Edificio edificio3 = edificioProvider.getObject();
		
		edificio3.setAddress("6537 Fleetwood Bld");
		edificio3.setCitta("Chigaco");
		edificio3.setNome("Flowers Falls");
		repoEd.save(edificio3);
		

	Postazioni postazioni = Postazioni.builder()
			.tipoPostazione(TipoPostazione.OPENSPACE)
			.codice("AA003")
			.descrizione("Team Building Room1")
			.numeroMassimo(100)
			.libero(true)
			.edificio(edificio3)
			.build();
	repoPost.save(postazioni);
			
	
	return postazioni;
	
}
	
	@Bean("postazioni4")
	public Postazioni postazioniEdificio4() {
	
		
Edificio edificio4 = edificioProvider.getObject();
		
		edificio4.setAddress("23 Capitol Hill");
		edificio4.setCitta("San Franscisco");
		edificio4.setNome("Central Bank");
		repoEd.save(edificio4);
		


	Postazioni postazioni = Postazioni.builder()
			.tipoPostazione(TipoPostazione.OPENSPACE)
			.codice("AA004")
			.descrizione("Team Building Room2")
			.numeroMassimo(100)
			.libero(true)
			.edificio(edificio4)
			.build();
	repoPost.save(postazioni);
			
	
	return postazioni;
	
}
	
	@Bean("postazioni5")
	public Postazioni postazioniEdificio5() {
	
		

		
Edificio edificio5 = edificioProvider.getObject();
		
		edificio5.setAddress("987 Violet Street");
		edificio5.setCitta("Washington");
		edificio5.setNome("Federal Reserve");
		repoEd.save(edificio5);
		

	Postazioni postazioni = Postazioni.builder()
			.tipoPostazione(TipoPostazione.PRIVATO)
			.codice("AA005")
			.descrizione("Executive Suite")
			.numeroMassimo(4)
			.libero(true)
			.edificio(edificio5)
			.build();
	repoPost.save(postazioni);
			
	
	return postazioni;
	
}
	
	
	@Bean("postazioni6")
	public Postazioni postazioniEdificio6() {
	
		

		
Edificio edificio6 = edificioProvider.getObject();
		
		edificio6.setAddress("3568 34th Street");
		edificio6.setCitta("New York");
		edificio6.setNome("The Chrysteller Building");
		repoEd.save(edificio6);
		

	Postazioni postazioni = Postazioni.builder()
			.tipoPostazione(TipoPostazione.PRIVATO)
			.codice("AA006")
			.descrizione("Executive Suite")
			.numeroMassimo(4)
			.libero(true)
			.edificio(edificio6)
			.build();
	repoPost.save(postazioni);
			
	
	return postazioni;
	
}
	
}
