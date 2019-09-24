package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prestation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestation;
	private String nomPrestation;
	@ManyToOne
	private TypePrestation typePrestation;
	@ManyToOne
	private Reservation reservation;

	public Prestation() {
	}

	public Long getIdPrestation() {
		return idPrestation;
	}

	public void setIdPrestation(Long idPrestation) {
		this.idPrestation = idPrestation;
	}

	public String getNomPrestation() {
		return nomPrestation;
	}

	public void setNomPrestation(String nomPrestation) {
		this.nomPrestation = nomPrestation;
	}

	public TypePrestation getTypePrestation() {
		return typePrestation;
	}

	public void setTypePrestation(TypePrestation typePrestation) {
		this.typePrestation = typePrestation;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
