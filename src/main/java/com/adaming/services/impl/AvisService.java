package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Avis;
import com.adaming.repositories.AvisRepository;
import com.adaming.services.interfaces.IAvisService;

@Service
public class AvisService implements IAvisService {
	@Autowired
	AvisRepository avisRepository;

	@Override
	public List<Avis> findAll() {
		return avisRepository.findAll();
	}

	@Override
	public Avis findOne(Long idAvis) {
		return avisRepository.findOne(idAvis);
	}

	@Override
	public Avis save(Avis avis) {
		return avisRepository.save(avis);
	}

	@Override
	public void delete(Long idAvis) {
		avisRepository.delete(idAvis);
	}

}
