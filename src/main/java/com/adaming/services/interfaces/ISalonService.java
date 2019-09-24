package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Salon;

public interface ISalonService {
	List<Salon> findAll();

	Salon findOne(Long idSalon);

	Salon save(Salon salon);

	void delete(Long idSalon);
}
