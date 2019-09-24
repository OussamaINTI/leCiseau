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
public class TypeLivraison implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTypeLivraison;
	private String libelle;
	@OneToMany(mappedBy = "typeLivraison", fetch = FetchType.EAGER)
	private Set<Livraison> livraisons = new HashSet<Livraison>();

	public TypeLivraison() {
	}

	public Long getIdTypeLivraison() {
		return idTypeLivraison;
	}

	public void setIdTypeLivraison(Long idTypeLivraison) {
		this.idTypeLivraison = idTypeLivraison;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Livraison> getLivraisons() {
		return livraisons;
	}

	public void setLivraisons(Set<Livraison> livraisons) {
		this.livraisons = livraisons;
	}

}
