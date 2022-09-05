package com.epicode.gestioneprenotazioni.edificio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
	@Autowired
	private EdificioRepository repo;
	public void create(Edificio edificio) {
		repo.save(edificio);
		
	}
	public Edificio read(Long id) {
		return repo.findById((long) id).get();
	}
	public void update(Edificio edificio) {
		repo.save(edificio);
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
