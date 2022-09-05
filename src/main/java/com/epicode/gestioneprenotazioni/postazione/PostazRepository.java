package com.epicode.gestioneprenotazioni.postazione;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PostazRepository extends CrudRepository<Postaz, Long>{
	public List<Postaz> findByTipo(TipologiaPostaz tipo);
	
}
