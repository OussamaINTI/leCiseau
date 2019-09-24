package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Avis;
import com.adaming.services.interfaces.IAvisService;

@RestController
public class AvisController {
	@Autowired
	IAvisService avisService;

	@RequestMapping(value = "avis", method = RequestMethod.GET)
	public List<Avis> findAll() {
		return avisService.findAll();
	}

	@RequestMapping(value = "avis/{idAvis}", method = RequestMethod.GET)
	public Avis findOne(@PathVariable("idAvis") Long idAvis) {
		return avisService.findOne(idAvis);
	}

	@RequestMapping(value = "avis", method = RequestMethod.POST)
	public Avis saveAvis(@RequestBody Avis role) {
		return avisService.save(role);
	}

	@RequestMapping(value = "avis/{idAvis}", method = RequestMethod.DELETE)
	public void deleteAvis(@PathVariable("idAvis") Long idAvis) {
		avisService.delete(idAvis);
	}

	@RequestMapping(value = "avis/{idAvis}", method = RequestMethod.PUT)
	public Avis updateAvis(@PathVariable("idAvis") Long idAvis, @RequestBody Avis role) {
		Avis currentAvis = avisService.findOne(idAvis);
		return avisService.save(currentAvis);

	}

}
