package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Reservation;
import com.adaming.services.interfaces.IReservationService;

@RestController
public class ReservationController {
	@Autowired
	IReservationService reservationService;
	@RequestMapping(value="reservations", method = RequestMethod.GET)
	public List<Reservation> findAll(){
		return reservationService.findAll();
	}
	@RequestMapping(value="reservations/{idReservation}", method = RequestMethod.GET)
	public Reservation findOne(@PathVariable("idReservation") Long idReservation) {
		return reservationService.findOne(idReservation);
	}
	@RequestMapping(value="reservations", method = RequestMethod.POST)
	public Reservation saveReservation(@RequestBody Reservation role) {
		return reservationService.save(role);
	}
	@RequestMapping(value="reservations/{idReservation}", method = RequestMethod.DELETE)
	public void deleteReservation(@PathVariable("idReservation") Long idReservation) {
		reservationService.delete(idReservation);
	}
	@RequestMapping(value="reservations/{idReservation}", method= RequestMethod.PUT)
	public Reservation updateReservation(@PathVariable("idReservation") Long idReservation,@RequestBody Reservation role) {
		Reservation currentReservation = reservationService.findOne(idReservation);
		return reservationService.save(currentReservation);
		
	}
}
