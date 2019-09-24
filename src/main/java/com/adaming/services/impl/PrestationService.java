package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Prestation;
import com.adaming.repositories.PrestationRepository;
import com.adaming.services.interfaces.IPrestationService;

@Service
public class PrestationService implements IPrestationService {
	@Autowired
	PrestationRepository prestationRepository;

	@Override
	public List<Prestation> findAll() {
		return prestationRepository.findAll();
	}

	@Override
	public Prestation findOne(Long idPrestation) {
		return prestationRepository.findOne(idPrestation);
	}

	@Override
	public Prestation save(Prestation prestation) {
		return prestationRepository.save(prestation);
	}

	@Override
	public void delete(Long idPrestation) {
		prestationRepository.delete(idPrestation);
	}

}
