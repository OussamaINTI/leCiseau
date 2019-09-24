package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Marque;

public interface IMarqueService {
	List<Marque> findAll();

	Marque findOne(Long idMarque);

	Marque save(Marque marque);

	void delete(Long idMarque);
}
