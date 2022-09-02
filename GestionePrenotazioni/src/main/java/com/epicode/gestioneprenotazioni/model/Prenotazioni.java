package com.epicode.gestioneprenotazioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazioni {

	private Postazioni postazione;
	private boolean valido = false;
	//private Utente utente;

}
