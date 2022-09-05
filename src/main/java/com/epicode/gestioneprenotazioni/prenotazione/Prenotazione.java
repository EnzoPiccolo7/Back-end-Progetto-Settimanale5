package com.epicode.gestioneprenotazioni.prenotazione;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



import com.epicode.gestioneprenotazioni.postazione.Postaz;
import com.epicode.gestioneprenotazioni.user.User;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Prenotazione {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate giornoPrenotazione;
	@ManyToOne
	private Postaz postazione;
	@ManyToOne
	private User utente;
	public Prenotazione(LocalDate giornoPrenotazione, Postaz postazione, User utente) {
		super();
		this.giornoPrenotazione = giornoPrenotazione;
		this.postazione = postazione;
		this.utente = utente;
	}
}
