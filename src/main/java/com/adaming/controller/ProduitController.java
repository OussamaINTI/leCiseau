package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Produit;
import com.adaming.services.interfaces.IProduitService;

@RestController
public class ProduitController {
	@Autowired
	IProduitService produitService;

	@RequestMapping(value = "produits", method = RequestMethod.GET)
	public List<Produit> findAll() {
		return produitService.findAll();
	}

	@RequestMapping(value = "produits/{idProduit}", method = RequestMethod.GET)
	public Produit findOne(@PathVariable("idProduit") Long idProduit) {
		return produitService.findOne(idProduit);
	}

	@RequestMapping(value = "produits", method = RequestMethod.POST)
	public Produit saveProduit(@RequestBody Produit role) {
		return produitService.save(role);
	}

	@RequestMapping(value = "produits/{idProduit}", method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("idProduit") Long idProduit) {
		produitService.delete(idProduit);
	}

	@RequestMapping(value = "produits/{idProduit}", method = RequestMethod.PUT)
	public Produit updateProduit(@PathVariable("idProduit") Long idProduit, @RequestBody Produit role) {
		Produit currentProduit = produitService.findOne(idProduit);
		return produitService.save(currentProduit);

	}
}
