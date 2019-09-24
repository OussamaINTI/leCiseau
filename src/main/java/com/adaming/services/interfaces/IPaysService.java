package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Pays;

public interface IPaysService {
	List<Pays> findAll();

	Pays findOne(Long idPays);

	Pays save(Pays pays);

	void delete(Long idPays);
}
