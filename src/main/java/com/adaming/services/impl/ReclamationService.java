package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Reclamation;
import com.adaming.repositories.ReclamationRepository;
import com.adaming.services.interfaces.IReclamationService;

@Service
public class ReclamationService implements IReclamationService {
	@Autowired
	ReclamationRepository reclamationRepository;

	@Override
	public List<Reclamation> findAll() {
		return reclamationRepository.findAll();
	}

	@Override
	public Reclamation findOne(Long idReclamation) {
		return reclamationRepository.findOne(idReclamation);
	}

	@Override
	public Reclamation save(Reclamation reclamation) {
		return reclamationRepository.save(reclamation);
	}

	@Override
	public void delete(Long idReclamation) {
		reclamationRepository.delete(idReclamation);
	}

}
