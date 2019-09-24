package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Commande;
import com.adaming.services.interfaces.ICommandeService;

@RestController
public class CommandeController {
	@Autowired
	ICommandeService commandeService;

	@RequestMapping(value = "commandes", method = RequestMethod.GET)
	public List<Commande> findAll() {
		return commandeService.findAll();
	}

	@RequestMapping(value = "commandes/{idCommande}", method = RequestMethod.GET)
	public Commande findOne(@PathVariable("idCommande") Long idCommande) {
		return commandeService.findOne(idCommande);
	}

	@RequestMapping(value = "commandes", method = RequestMethod.POST)
	public Commande saveCommande(@RequestBody Commande role) {
		return commandeService.save(role);
	}

	@RequestMapping(value = "commandes/{idCommande}", method = RequestMethod.DELETE)
	public void deleteCommande(@PathVariable("idCommande") Long idCommande) {
		commandeService.delete(idCommande);
	}

	@RequestMapping(value = "commandes/{idCommande}", method = RequestMethod.PUT)
	public Commande updateCommande(@PathVariable("idCommande") Long idCommande, @RequestBody Commande role) {
		Commande currentCommande = commandeService.findOne(idCommande);
		return commandeService.save(currentCommande);

	}
}
