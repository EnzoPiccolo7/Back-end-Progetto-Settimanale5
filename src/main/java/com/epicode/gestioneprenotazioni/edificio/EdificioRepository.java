package com.epicode.gestioneprenotazioni.edificio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EdificioRepository extends CrudRepository<Edificio, Long>{

	
}
