package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Livraison;

public interface ILivraisonService {
	List<Livraison> findAll();

	Livraison findOne(Long idLivraison);

	Livraison save(Livraison livraison);

	void delete(Long idLivraison);
}
