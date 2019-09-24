package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Reclamation;
import com.adaming.services.interfaces.IReclamationService;

@RestController
public class ReclamationController {
	@Autowired
	IReclamationService reclamationService;

	@RequestMapping(value = "reclamations", method = RequestMethod.GET)
	public List<Reclamation> findAll() {
		return reclamationService.findAll();
	}

	@RequestMapping(value = "reclamations/{idReclamation}", method = RequestMethod.GET)
	public Reclamation findOne(@PathVariable("idReclamation") Long idReclamation) {
		return reclamationService.findOne(idReclamation);
	}

	@RequestMapping(value = "reclamations", method = RequestMethod.POST)
	public Reclamation saveReclamation(@RequestBody Reclamation role) {
		return reclamationService.save(role);
	}

	@RequestMapping(value = "reclamations/{idReclamation}", method = RequestMethod.DELETE)
	public void deleteReclamation(@PathVariable("idReclamation") Long idReclamation) {
		reclamationService.delete(idReclamation);
	}

	@RequestMapping(value = "reclamations/{idReclamation}", method = RequestMethod.PUT)
	public Reclamation updateReclamation(@PathVariable("idReclamation") Long idReclamation,
			@RequestBody Reclamation role) {
		Reclamation currentReclamation = reclamationService.findOne(idReclamation);
		return reclamationService.save(currentReclamation);

	}
}
