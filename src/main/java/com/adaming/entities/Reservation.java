package com.adaming.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	@Temporal(TemporalType.DATE)
	private Date dateReservation;
	@OneToMany(mappedBy = "reservation", fetch = FetchType.EAGER)
	private Set<Prestation> prestations = new HashSet<Prestation>();
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="reservation_salon", joinColumns = {
			@JoinColumn(name="id_reservation", referencedColumnName = "idReservation")},
			inverseJoinColumns = {@JoinColumn(name="id_salon", table ="salon", 
			referencedColumnName = "idSalon")}			)
	private Set<Salon> salons = new HashSet<Salon>();

	public Reservation() {
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Set<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(Set<Prestation> prestations) {
		this.prestations = prestations;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Set<Salon> getSalons() {
		return salons;
	}

	public void setSalons(Set<Salon> salons) {
		this.salons = salons;
	}

}
