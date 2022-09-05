package com.epicode.gestioneprenotazioni.postazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/postazione")
public class PostazController {
	
	@Autowired 
	private PostazioneService repo;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public void getPostazioneById(@PathVariable Long id){
		repo.read(id);
	}
	
	
	

	@RequestMapping(method = RequestMethod.GET)
	
	
	@GetMapping(value ="/{tipoPostazione}")
	public void findByTipo(@RequestParam(value = "tipo") TipologiaPostaz tipo) {
		repo.findByTipo(tipo);
	}
	@PostMapping
	public void postPostazione(@RequestBody Postaz postazione) {
		repo.create(postazione);
	}
	@PutMapping
	public void putPostazione(@RequestBody Postaz postazione) {
		repo.update(postazione);
	}
	@DeleteMapping("/{id}")
	public void deletePostazione(@PathVariable Long id) {
		repo.delete(id);
	}
}
