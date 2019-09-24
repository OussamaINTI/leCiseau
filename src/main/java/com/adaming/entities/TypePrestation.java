package com.adaming.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypePrestation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTypePrestation;
	private String libelle;
	@OneToMany(mappedBy = "typePrestation", fetch = FetchType.EAGER)
	private Set<Prestation> prestations = new HashSet<Prestation>();

	public TypePrestation() {
	}

	public Long getIdTypePrestation() {
		return idTypePrestation;
	}

	public void setIdTypePrestation(Long idTypePrestation) {
		this.idTypePrestation = idTypePrestation;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(Set<Prestation> prestations) {
		this.prestations = prestations;
	}

}
