package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Livraison;
import com.adaming.services.interfaces.ILivraisonService;

@RestController
public class LivraisonController {
	@Autowired
	ILivraisonService livraisonService;

	@RequestMapping(value = "livraisons", method = RequestMethod.GET)
	public List<Livraison> findAll() {
		return livraisonService.findAll();
	}

	@RequestMapping(value = "livraisons/{idLivraison}", method = RequestMethod.GET)
	public Livraison findOne(@PathVariable("idLivraison") Long idLivraison) {
		return livraisonService.findOne(idLivraison);
	}

	@RequestMapping(value = "livraisons", method = RequestMethod.POST)
	public Livraison saveLivraison(@RequestBody Livraison role) {
		return livraisonService.save(role);
	}

	@RequestMapping(value = "livraisons/{idLivraison}", method = RequestMethod.DELETE)
	public void deleteLivraison(@PathVariable("idLivraison") Long idLivraison) {
		livraisonService.delete(idLivraison);
	}

	@RequestMapping(value = "livraisons/{idLivraison}", method = RequestMethod.PUT)
	public Livraison updateLivraison(@PathVariable("idLivraison") Long idLivraison, @RequestBody Livraison role) {
		Livraison currentLivraison = livraisonService.findOne(idLivraison);
		return livraisonService.save(currentLivraison);

	}
}
