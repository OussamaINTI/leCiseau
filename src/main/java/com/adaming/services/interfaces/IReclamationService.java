package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Reclamation;

public interface IReclamationService {
	List<Reclamation> findAll();

	Reclamation findOne(Long idReclamation);

	Reclamation save(Reclamation reclamation);

	void delete(Long idReclamation);
}
