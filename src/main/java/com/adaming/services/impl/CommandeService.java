package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Commande;
import com.adaming.repositories.CommandeRepository;
import com.adaming.services.interfaces.ICommandeService;

@Service
public class CommandeService implements ICommandeService {
	@Autowired
	CommandeRepository commandeRepository;

	@Override
	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}

	@Override
	public Commande findOne(Long idCommande) {
		return commandeRepository.findOne(idCommande);
	}

	@Override
	public Commande save(Commande commande) {
		return commandeRepository.save(commande);
	}

	@Override
	public void delete(Long idCommande) {
		commandeRepository.delete(idCommande);
	}

}
