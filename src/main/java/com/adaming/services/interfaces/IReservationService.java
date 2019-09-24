package com.adaming.services.interfaces;

import java.util.List;

import com.adaming.entities.Reservation;

public interface IReservationService {
	List<Reservation> findAll();

	Reservation findOne(Long idReservation);

	Reservation save(Reservation reservation);

	void delete(Long idReservation);
}
