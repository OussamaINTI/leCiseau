package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Marque;
import com.adaming.services.interfaces.IMarqueService;

@RestController
public class MarqueController {
	@Autowired
	IMarqueService marqueService;

	@RequestMapping(value = "marques", method = RequestMethod.GET)
	public List<Marque> findAll() {
		return marqueService.findAll();
	}

	@RequestMapping(value = "marques/{idMarque}", method = RequestMethod.GET)
	public Marque findOne(@PathVariable("idMarque") Long idMarque) {
		return marqueService.findOne(idMarque);
	}

	@RequestMapping(value = "marques", method = RequestMethod.POST)
	public Marque saveMarque(@RequestBody Marque role) {
		return marqueService.save(role);
	}

	@RequestMapping(value = "marques/{idMarque}", method = RequestMethod.DELETE)
	public void deleteMarque(@PathVariable("idMarque") Long idMarque) {
		marqueService.delete(idMarque);
	}

	@RequestMapping(value = "marques/{idMarque}", method = RequestMethod.PUT)
	public Marque updateMarque(@PathVariable("idMarque") Long idMarque, @RequestBody Marque role) {
		Marque currentMarque = marqueService.findOne(idMarque);
		return marqueService.save(currentMarque);

	}
}
