package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Salon;
import com.adaming.services.interfaces.ISalonService;

@RestController
public class SalonController {
	@Autowired
	ISalonService salonService;
	@RequestMapping(value="salons", method = RequestMethod.GET)
	public List<Salon> findAll(){
		return salonService.findAll();
	}
	@RequestMapping(value="salons/{idSalon}", method = RequestMethod.GET)
	public Salon findOne(@PathVariable("idSalon") Long idSalon) {
		return salonService.findOne(idSalon);
	}
	@RequestMapping(value="salons", method = RequestMethod.POST)
	public Salon saveSalon(@RequestBody Salon role) {
		return salonService.save(role);
	}
	@RequestMapping(value="salons/{idSalon}", method = RequestMethod.DELETE)
	public void deleteSalon(@PathVariable("idSalon") Long idSalon) {
		salonService.delete(idSalon);
	}
	@RequestMapping(value="salons/{idSalon}", method= RequestMethod.PUT)
	public Salon updateSalon(@PathVariable("idSalon") Long idSalon,@RequestBody Salon role) {
		Salon currentSalon = salonService.findOne(idSalon);
		return salonService.save(currentSalon);
		
	}
}
