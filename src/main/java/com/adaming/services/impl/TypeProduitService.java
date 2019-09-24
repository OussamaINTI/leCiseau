package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.TypeProduit;
import com.adaming.repositories.TypeProduitRepository;
import com.adaming.services.interfaces.ITypeProduitService;

@Service
public class TypeProduitService implements ITypeProduitService {
	@Autowired
	TypeProduitRepository typeProduitRepository;

	@Override
	public List<TypeProduit> findAll() {
		return typeProduitRepository.findAll();
	}

	@Override
	public TypeProduit findOne(Long idTypeProduit) {
		return typeProduitRepository.findOne(idTypeProduit);
	}

	@Override
	public TypeProduit save(TypeProduit typeProduit) {
		return typeProduitRepository.save(typeProduit);
	}

	@Override
	public void delete(Long idTypeProduit) {
		typeProduitRepository.delete(idTypeProduit);
	}

}
