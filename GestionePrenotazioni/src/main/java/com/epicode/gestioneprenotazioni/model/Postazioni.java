package com.epicode.gestioneprenotazioni.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Postazioni {
	
	private TipoPostazione tipoPostazione;
	@Id
	private String codice;
	private String descrizione;
	private Integer numeroMassimo;
	@OneToOne
	private Edificio edificio;
	private boolean libero;

}
