package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Categorie;
import com.adaming.services.interfaces.ICategorieService;

@RestController
public class CategorieController {
	@Autowired
	ICategorieService categorieService;
	@RequestMapping(value="categories", method = RequestMethod.GET)
	public List<Categorie> findAll(){
		return categorieService.findAll();
	}
	@RequestMapping(value="categories/{idCategorie}", method = RequestMethod.GET)
	public Categorie findOne(@PathVariable("idCategorie") Long idCategorie) {
		return categorieService.findOne(idCategorie);
	}
	@RequestMapping(value="categories", method = RequestMethod.POST)
	public Categorie saveCategorie(@RequestBody Categorie role) {
		return categorieService.save(role);
	}
	@RequestMapping(value="categories/{idCategorie}", method = RequestMethod.DELETE)
	public void deleteCategorie(@PathVariable("idCategorie") Long idCategorie) {
		categorieService.delete(idCategorie);
	}
	@RequestMapping(value="categories/{idCategorie}", method= RequestMethod.PUT)
	public Categorie updateCategorie(@PathVariable("idCategorie") Long idCategorie,@RequestBody Categorie role) {
		Categorie currentCategorie = categorieService.findOne(idCategorie);
		return categorieService.save(currentCategorie);
		
	}
}
