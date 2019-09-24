package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.TypePrestation;
import com.adaming.services.interfaces.ITypePrestationService;

@RestController
public class TypePrestationController {
	@Autowired
	ITypePrestationService prestationService;

	@RequestMapping(value = "typePrestations", method = RequestMethod.GET)
	public List<TypePrestation> findAll() {
		return prestationService.findAll();
	}

	@RequestMapping(value = "typePrestations/{idTypePrestation}", method = RequestMethod.GET)
	public TypePrestation findOne(@PathVariable("idTypePrestation") Long idTypePrestation) {
		return prestationService.findOne(idTypePrestation);
	}

	@RequestMapping(value = "typePrestations", method = RequestMethod.POST)
	public TypePrestation saveTypePrestation(@RequestBody TypePrestation role) {
		return prestationService.save(role);
	}

	@RequestMapping(value = "typePrestations/{idTypePrestation}", method = RequestMethod.DELETE)
	public void deleteTypePrestation(@PathVariable("idTypePrestation") Long idTypePrestation) {
		prestationService.delete(idTypePrestation);
	}

	@RequestMapping(value = "typePrestations/{idTypePrestation}", method = RequestMethod.PUT)
	public TypePrestation updateTypePrestation(@PathVariable("idTypePrestation") Long idTypePrestation,
			@RequestBody TypePrestation role) {
		TypePrestation currentTypePrestation = prestationService.findOne(idTypePrestation);
		return prestationService.save(currentTypePrestation);

	}
}
