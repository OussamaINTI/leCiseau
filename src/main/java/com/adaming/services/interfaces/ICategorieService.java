package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Categorie;

public interface ICategorieService {
	List<Categorie> findAll();

	Categorie findOne(Long idCategorie);

	Categorie save(Categorie categorie);

	void delete(Long idCategorie);
}
