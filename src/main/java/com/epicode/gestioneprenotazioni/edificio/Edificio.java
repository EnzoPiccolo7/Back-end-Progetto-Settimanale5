package com.epicode.gestioneprenotazioni.edificio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



import com.epicode.gestioneprenotazioni.postazione.Postaz;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor

public class Edificio {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String indirizzo;
	private String citta;
	@OneToMany
	private	List<Postaz> postazioni = new ArrayList<>();
	
	public Edificio(String nome, String indirizzo, String citta, List<Postaz> postazioni) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.postazioni = postazioni;
	}
	
}
