package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Categorie;
import com.adaming.repositories.CategorieRepository;
import com.adaming.services.interfaces.ICategorieService;

@Service
public class CategorieService implements ICategorieService {
	@Autowired
	CategorieRepository categoryRepository;

	@Override
	public List<Categorie> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Categorie findOne(Long idCategorie) {
		return categoryRepository.findOne(idCategorie);
	}

	@Override
	public Categorie save(Categorie categorie) {
		return categoryRepository.save(categorie);
	}

	@Override
	public void delete(Long idCategorie) {
		categoryRepository.delete(idCategorie);
	}

}
