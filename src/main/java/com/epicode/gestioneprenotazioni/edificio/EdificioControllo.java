package com.epicode.gestioneprenotazioni.edificio;

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
@RequestMapping("/edifici")
public class EdificioControllo {
	@Autowired
	private EdificioService repo;
	
	@GetMapping("/{id}")
	public void getEdificioById(@PathVariable Long id){
		repo.read(id);
	}
	@PostMapping
	public void postEdificio(@RequestBody Edificio edificio) {
		repo.create(edificio);
	}
	@PutMapping
	public void putEdificio(@RequestBody Edificio edificio) {
		repo.update(edificio);
	}
	@DeleteMapping("/{id}")
	public void deleteEdificio(@PathVariable Long id) {
		repo.delete(id);
	}
}
