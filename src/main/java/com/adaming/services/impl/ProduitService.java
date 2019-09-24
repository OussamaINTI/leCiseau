package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Produit;
import com.adaming.repositories.ProduitRepository;
import com.adaming.services.interfaces.IProduitService;

@Service
public class ProduitService implements IProduitService {
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public List<Produit> findAll() {
		return produitRepository.findAll();
	}

	@Override
	public Produit findOne(Long idProduit) {
		return produitRepository.findOne(idProduit);
	}

	@Override
	public Produit save(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public void delete(Long idProduit) {
		produitRepository.delete(idProduit);
	}

}
