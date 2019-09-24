package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.TypeProduit;
import com.adaming.services.interfaces.ITypeProduitService;

@RestController
public class TypeProduitController {
	@Autowired
	ITypeProduitService typeProduitService;
	@RequestMapping(value="typeProduits", method = RequestMethod.GET)
	public List<TypeProduit> findAll(){
		return typeProduitService.findAll();
	}
	@RequestMapping(value="typeProduits/{idTypeProduit}", method = RequestMethod.GET)
	public TypeProduit findOne(@PathVariable("idTypeProduit") Long idTypeProduit) {
		return typeProduitService.findOne(idTypeProduit);
	}
	@RequestMapping(value="typeProduits", method = RequestMethod.POST)
	public TypeProduit saveTypeProduit(@RequestBody TypeProduit role) {
		return typeProduitService.save(role);
	}
	@RequestMapping(value="typeProduits/{idTypeProduit}", method = RequestMethod.DELETE)
	public void deleteTypeProduit(@PathVariable("idTypeProduit") Long idTypeProduit) {
		typeProduitService.delete(idTypeProduit);
	}
	@RequestMapping(value="typeProduits/{idTypeProduit}", method= RequestMethod.PUT)
	public TypeProduit updateTypeProduit(@PathVariable("idTypeProduit") Long idTypeProduit,@RequestBody TypeProduit role) {
		TypeProduit currentTypeProduit = typeProduitService.findOne(idTypeProduit);
		return typeProduitService.save(currentTypeProduit);
		
	}
}
