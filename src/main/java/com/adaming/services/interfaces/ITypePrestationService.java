package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.TypePrestation;

public interface ITypePrestationService {
	List<TypePrestation> findAll();

	TypePrestation findOne(Long idTypePrestation);

	TypePrestation save(TypePrestation typePrestation);

	void delete(Long idTypePrestation);
}
