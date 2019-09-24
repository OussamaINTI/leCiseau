package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.TypeLivraison;

public interface ITypeLivraisonService {
	List<TypeLivraison> findAll();

	TypeLivraison findOne(Long idTypeLivraison);

	TypeLivraison save(TypeLivraison typeLivraison);

	void delete(Long idTypeLivraison);
}
