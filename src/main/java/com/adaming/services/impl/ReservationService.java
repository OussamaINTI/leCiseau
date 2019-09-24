package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Reservation;
import com.adaming.repositories.ReservationRepository;
import com.adaming.services.interfaces.IReservationService;

@Service
public class ReservationService implements IReservationService {
	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}

	@Override
	public Reservation findOne(Long idReservation) {
		return reservationRepository.findOne(idReservation);
	}

	@Override
	public Reservation save(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public void delete(Long idReservation) {
		reservationRepository.delete(idReservation);
	}

}
