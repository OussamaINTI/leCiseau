package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Prestation;
import com.adaming.services.interfaces.IPrestationService;

@RestController
public class PrestationController {
	@Autowired
	IPrestationService prestationService;

	@RequestMapping(value = "prestations", method = RequestMethod.GET)
	public List<Prestation> findAll() {
		return prestationService.findAll();
	}

	@RequestMapping(value = "prestations/{idPrestation}", method = RequestMethod.GET)
	public Prestation findOne(@PathVariable("idPrestation") Long idPrestation) {
		return prestationService.findOne(idPrestation);
	}

	@RequestMapping(value = "prestations", method = RequestMethod.POST)
	public Prestation savePrestation(@RequestBody Prestation role) {
		return prestationService.save(role);
	}

	@RequestMapping(value = "prestations/{idPrestation}", method = RequestMethod.DELETE)
	public void deletePrestation(@PathVariable("idPrestation") Long idPrestation) {
		prestationService.delete(idPrestation);
	}

	@RequestMapping(value = "prestations/{idPrestation}", method = RequestMethod.PUT)
	public Prestation updatePrestation(@PathVariable("idPrestation") Long idPrestation, @RequestBody Prestation role) {
		Prestation currentPrestation = prestationService.findOne(idPrestation);
		return prestationService.save(currentPrestation);

	}
}
