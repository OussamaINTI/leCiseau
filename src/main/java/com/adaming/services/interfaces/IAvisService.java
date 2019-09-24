package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Avis;

public interface IAvisService {
	List<Avis> findAll();

	Avis findOne(Long idAvis);

	Avis save(Avis avis);

	void delete(Long idAvis);
}
