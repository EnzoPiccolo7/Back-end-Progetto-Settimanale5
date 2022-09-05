package com.epicode.gestioneprenotazioni.prenotazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/prenotazione")
public class PrenotazioneController {
	@Autowired
	private PrenotazioneService repo;
	
	@GetMapping("/{id}")
	public void getPrenotazioneById(@PathVariable Long id){
		repo.read(id);
	}
	@PostMapping
	public void postPrenotazione(@RequestBody Prenotazione prenotazione) {
		repo.create(prenotazione);
	}
	@PutMapping
	public void putPrenotazione(@RequestBody Prenotazione prenotazione) {
		repo.update(prenotazione);
	}
	@DeleteMapping("/{id}")
	public void deleteprenotazione(@PathVariable Long id) {
		repo.delete(id);
	}
	
}
