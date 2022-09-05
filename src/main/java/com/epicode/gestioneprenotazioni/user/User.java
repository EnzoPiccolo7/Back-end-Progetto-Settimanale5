package com.epicode.gestioneprenotazioni.user;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.epicode.gestioneprenotazioni.prenotazione.Prenotazione;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor

public class User{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String nomeCompleto;
	private String email;
	@OneToMany
	private List<Prenotazione> prenotazioni = new ArrayList<>();
	public User(String username, String nomeCompleto, String email) {
		super();
		this.username = username;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		
	}
	
}
