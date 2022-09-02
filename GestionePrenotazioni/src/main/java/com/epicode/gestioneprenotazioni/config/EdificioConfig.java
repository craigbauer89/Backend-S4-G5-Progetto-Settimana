package com.epicode.gestioneprenotazioni.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestioneprenotazioni.model.Edificio;
@Configuration
public class EdificioConfig {

	@Bean("theManhattan")
	@Scope("singleton")
	public Edificio theManhattan() {
		return new Edificio("The Manhattan", "122 Park Avenue", "New York");
	}

}
