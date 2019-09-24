package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Pays;
import com.adaming.repositories.PaysRepository;
import com.adaming.services.interfaces.IPaysService;

@Service
public class PaysService implements IPaysService {
	@Autowired
	PaysRepository paysRepository;

	@Override
	public List<Pays> findAll() {
		return paysRepository.findAll();
	}

	@Override
	public Pays findOne(Long idPays) {
		return paysRepository.findOne(idPays);
	}

	@Override
	public Pays save(Pays pays) {
		return paysRepository.save(pays);
	}

	@Override
	public void delete(Long idPays) {
		paysRepository.delete(idPays);
	}

}
