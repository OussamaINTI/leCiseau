package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Ville;
import com.adaming.services.interfaces.IVilleService;

@RestController
public class VilleController {
	@Autowired
	IVilleService villeService;

	@RequestMapping(value = "villes", method = RequestMethod.GET)
	public List<Ville> findAll() {
		return villeService.findAll();
	}

	@RequestMapping(value = "villes/{idVille}", method = RequestMethod.GET)
	public Ville findOne(@PathVariable("idVille") Long idVille) {
		return villeService.findOne(idVille);
	}

	@RequestMapping(value = "villes", method = RequestMethod.POST)
	public Ville saveVille(@RequestBody Ville role) {
		return villeService.save(role);
	}

	@RequestMapping(value = "villes/{idVille}", method = RequestMethod.DELETE)
	public void deleteVille(@PathVariable("idVille") Long idVille) {
		villeService.delete(idVille);
	}

	@RequestMapping(value = "villes/{idVille}", method = RequestMethod.PUT)
	public Ville updateVille(@PathVariable("idVille") Long idVille, @RequestBody Ville role) {
		Ville currentVille = villeService.findOne(idVille);
		return villeService.save(currentVille);

	}
}
