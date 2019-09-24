package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Utilisateur;
import com.adaming.services.interfaces.IUtilisateurService;

@RestController
public class UtilisateurController {
	@Autowired
	IUtilisateurService utilisateurService;

	@RequestMapping(value = "utilisateurs", method = RequestMethod.GET)
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@RequestMapping(value = "utilisateurs/{idUtilisateur}", method = RequestMethod.GET)
	public Utilisateur findOne(@PathVariable("idUtilisateur") Long idUtilisateur) {
		return utilisateurService.findOne(idUtilisateur);
	}

	@RequestMapping(value = "utilisateurs", method = RequestMethod.POST)
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur role) {
		return utilisateurService.save(role);
	}

	@RequestMapping(value = "utilisateurs/{idUtilisateur}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur) {
		utilisateurService.delete(idUtilisateur);
	}

	@RequestMapping(value = "utilisateurs/{idUtilisateur}", method = RequestMethod.PUT)
	public Utilisateur updateUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur,
			@RequestBody Utilisateur role) {
		Utilisateur currentUtilisateur = utilisateurService.findOne(idUtilisateur);
		return utilisateurService.save(currentUtilisateur);

	}
}
