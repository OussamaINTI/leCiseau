package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Prestation;

public interface IPrestationService {
	List<Prestation> findAll();

	Prestation findOne(Long idPrestation);

	Prestation save(Prestation prestation);

	void delete(Long idPrestation);
}
