package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Pays;
import com.adaming.services.interfaces.IPaysService;

@RestController
public class PaysController {
	@Autowired
	IPaysService paysService;

	@RequestMapping(value = "pays", method = RequestMethod.GET)
	public List<Pays> findAll() {
		return paysService.findAll();
	}

	@RequestMapping(value = "pays/{idPays}", method = RequestMethod.GET)
	public Pays findOne(@PathVariable("idPays") Long idPays) {
		return paysService.findOne(idPays);
	}

	@RequestMapping(value = "pays", method = RequestMethod.POST)
	public Pays savePays(@RequestBody Pays role) {
		return paysService.save(role);
	}

	@RequestMapping(value = "pays/{idPays}", method = RequestMethod.DELETE)
	public void deletePays(@PathVariable("idPays") Long idPays) {
		paysService.delete(idPays);
	}

	@RequestMapping(value = "pays/{idPays}", method = RequestMethod.PUT)
	public Pays updatePays(@PathVariable("idPays") Long idPays, @RequestBody Pays role) {
		Pays currentPays = paysService.findOne(idPays);
		return paysService.save(currentPays);

	}
}
