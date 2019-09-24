package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.TypeLivraison;
import com.adaming.repositories.TypeLivraisonRepository;
import com.adaming.services.interfaces.ITypeLivraisonService;

@Service
public class TypeLivraisonService implements ITypeLivraisonService {
	@Autowired
	TypeLivraisonRepository typeLivraisonRepository;

	@Override
	public List<TypeLivraison> findAll() {
		return typeLivraisonRepository.findAll();
	}

	@Override
	public TypeLivraison findOne(Long idTypeLivraison) {
		return typeLivraisonRepository.findOne(idTypeLivraison);
	}

	@Override
	public TypeLivraison save(TypeLivraison typeLivraison) {
		return typeLivraisonRepository.save(typeLivraison);
	}

	@Override
	public void delete(Long idTypeLivraison) {
		typeLivraisonRepository.delete(idTypeLivraison);
	}

}
