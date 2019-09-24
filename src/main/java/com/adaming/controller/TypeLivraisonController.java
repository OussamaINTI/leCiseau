package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.TypeLivraison;
import com.adaming.services.interfaces.ITypeLivraisonService;

@RestController
public class TypeLivraisonController {
	@Autowired
	ITypeLivraisonService typeLivraisonService;

	@RequestMapping(value = "typeLivraisons", method = RequestMethod.GET)
	public List<TypeLivraison> findAll() {
		return typeLivraisonService.findAll();
	}

	@RequestMapping(value = "typeLivraisons/{idTypeLivraison}", method = RequestMethod.GET)
	public TypeLivraison findOne(@PathVariable("idTypeLivraison") Long idTypeLivraison) {
		return typeLivraisonService.findOne(idTypeLivraison);
	}

	@RequestMapping(value = "typeLivraisons", method = RequestMethod.POST)
	public TypeLivraison saveTypeLivraison(@RequestBody TypeLivraison role) {
		return typeLivraisonService.save(role);
	}

	@RequestMapping(value = "typeLivraisons/{idTypeLivraison}", method = RequestMethod.DELETE)
	public void deleteTypeLivraison(@PathVariable("idTypeLivraison") Long idTypeLivraison) {
		typeLivraisonService.delete(idTypeLivraison);
	}

	@RequestMapping(value = "typeLivraisons/{idTypeLivraison}", method = RequestMethod.PUT)
	public TypeLivraison updateTypeLivraison(@PathVariable("idTypeLivraison") Long idTypeLivraison,
			@RequestBody TypeLivraison role) {
		TypeLivraison currentTypeLivraison = typeLivraisonService.findOne(idTypeLivraison);
		return typeLivraisonService.save(currentTypeLivraison);

	}
}
