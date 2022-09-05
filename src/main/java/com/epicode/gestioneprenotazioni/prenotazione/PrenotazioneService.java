package com.epicode.gestioneprenotazioni.prenotazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {
	@Autowired
	private PrenotazioneRepository repo;
	public void create(Prenotazione prenotazione) {
		repo.save(prenotazione);
		
	}
	public Prenotazione read(Long id) {
		return repo.findById(id).get();
	}
	public void update(Prenotazione prenotazione) {
		repo.save(prenotazione);
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
