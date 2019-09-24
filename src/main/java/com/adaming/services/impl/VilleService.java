package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Ville;
import com.adaming.repositories.VilleRepository;
import com.adaming.services.interfaces.IVilleService;

@Service
public class VilleService implements IVilleService {
	@Autowired
	VilleRepository villeRepository;

	@Override
	public List<Ville> findAll() {
		return villeRepository.findAll();
	}

	@Override
	public Ville findOne(Long idVille) {
		return villeRepository.findOne(idVille);
	}

	@Override
	public Ville save(Ville ville) {
		return villeRepository.save(ville);
	}

	@Override
	public void delete(Long idVille) {
		villeRepository.delete(idVille);
	}

}
