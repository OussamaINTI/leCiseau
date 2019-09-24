package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Marque;
import com.adaming.repositories.MarqueRepository;
import com.adaming.services.interfaces.IMarqueService;

@Service
public class MarqueService implements IMarqueService {
	@Autowired
	MarqueRepository marqueRepository;

	@Override
	public List<Marque> findAll() {
		return marqueRepository.findAll();
	}

	@Override
	public Marque findOne(Long idMarque) {
		return marqueRepository.findOne(idMarque);
	}

	@Override
	public Marque save(Marque marque) {
		return marqueRepository.save(marque);
	}

	@Override
	public void delete(Long idMarque) {
		marqueRepository.delete(idMarque);
	}

}
