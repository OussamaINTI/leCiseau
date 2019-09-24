package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Commande;

public interface ICommandeService {
	List<Commande> findAll();

	Commande findOne(Long idCommande);

	Commande save(Commande commande);

	void delete(Long idCommande);
}
