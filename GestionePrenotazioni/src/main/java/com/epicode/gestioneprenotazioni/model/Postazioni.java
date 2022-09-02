package com.epicode.gestioneprenotazioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Postazioni {

	private TipoPostazione tipoPostazione;
	private String codice;
	private String descrizione;
	private Integer numeroMassimo;
	private Edificio edificio;
	private boolean libero;

}
