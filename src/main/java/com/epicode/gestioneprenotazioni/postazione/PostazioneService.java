package com.epicode.gestioneprenotazioni.postazione;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PostazioneService {
	@Autowired
	private PostazRepository repo;
	
	public void create(Postaz postazione) {
		repo.save(postazione);
		
	}
	public Postaz read(Long id) {
		return repo.findById(id).get();
	}
	
	public void update(Postaz postazione) {
		repo.save(postazione);
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public String findByTipo(TipologiaPostaz tipo) {
		List<Postaz> postazioni= new ArrayList<>(); 
		List<Postaz> postazioniTrovate= new ArrayList<>(); 
		
		repo.findAll().forEach(element->postazioni.add(element));
		postazioni.stream().filter(element->element.getTipologia() == tipo).forEach(element->postazioniTrovate.add(element));
		String x = "";	
		for (Postaz postazione : postazioniTrovate) {
			x+=postazione;
		}
		return x;
	}
	
}
