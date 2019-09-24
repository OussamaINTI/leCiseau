package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.TypeProduit;

public interface ITypeProduitService {
	List<TypeProduit> findAll();

	TypeProduit findOne(Long idTypeProduit);

	TypeProduit save(TypeProduit typeProduit);

	void delete(Long idTypeProduit);
}
