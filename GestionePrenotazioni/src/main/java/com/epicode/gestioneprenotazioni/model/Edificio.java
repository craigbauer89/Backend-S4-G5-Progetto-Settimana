package com.epicode.gestioneprenotazioni.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Edificio {

	private String nome;
	private String address;
	private String citta;
	//private List<Postazioni> postazione;
	

}
