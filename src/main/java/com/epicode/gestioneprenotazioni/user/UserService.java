package com.epicode.gestioneprenotazioni.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public void create(User utente) {
		repo.save(utente);
	}
	public User read(Long id) {
		return repo.findById(id).get();
	}
	public void update(User utente) {
		repo.save(utente);
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
