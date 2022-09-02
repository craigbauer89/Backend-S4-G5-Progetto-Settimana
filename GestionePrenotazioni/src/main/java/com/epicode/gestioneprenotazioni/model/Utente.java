package com.epicode.gestioneprenotazioni.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Utente {

	private String nome;
	private String username;
	private String email;
	private List<Prenotazioni> prenotazione;
	

}
