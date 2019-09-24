package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Salon;
import com.adaming.repositories.SalonRepository;
import com.adaming.services.interfaces.ISalonService;

@Service
public class SalonService implements ISalonService {
	@Autowired
	SalonRepository salonRepository;

	@Override
	public List<Salon> findAll() {
		return salonRepository.findAll();
	}

	@Override
	public Salon findOne(Long idSalon) {
		return salonRepository.findOne(idSalon);
	}

	@Override
	public Salon save(Salon salon) {
		return salonRepository.save(salon);
	}

	@Override
	public void delete(Long idSalon) {
		salonRepository.delete(idSalon);
	}

}
