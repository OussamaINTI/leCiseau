package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.TypePrestation;
import com.adaming.services.interfaces.ITypePrestationService;

@Service
public class TypePrestationService implements ITypePrestationService {
	@Autowired
	TypePrestationService typePrestationRepository;

	@Override
	public List<TypePrestation> findAll() {
		return typePrestationRepository.findAll();
	}

	@Override
	public TypePrestation findOne(Long idTypePrestation) {
		return typePrestationRepository.findOne(idTypePrestation);
	}

	@Override
	public TypePrestation save(TypePrestation typePrestation) {
		return typePrestationRepository.save(typePrestation);
	}

	@Override
	public void delete(Long idTypePrestation) {
		typePrestationRepository.delete(idTypePrestation);
	}

}
