package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Livraison;
import com.adaming.repositories.LivraisonRepository;
import com.adaming.services.interfaces.ILivraisonService;

@Service
public class LivraisonService implements ILivraisonService {
	@Autowired
	LivraisonRepository livraisonRepository;

	@Override
	public List<Livraison> findAll() {
		return livraisonRepository.findAll();
	}

	@Override
	public Livraison findOne(Long idLivraison) {
		return livraisonRepository.findOne(idLivraison);
	}

	@Override
	public Livraison save(Livraison livraison) {
		return livraisonRepository.save(livraison);
	}

	@Override
	public void delete(Long idLivraison) {
		livraisonRepository.delete(idLivraison);
	}

}
