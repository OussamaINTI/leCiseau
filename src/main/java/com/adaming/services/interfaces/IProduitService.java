package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Produit;

public interface IProduitService {
	List<Produit> findAll();

	Produit findOne(Long idProduit);

	Produit save(Produit produit);

	void delete(Long idProduit);
}
