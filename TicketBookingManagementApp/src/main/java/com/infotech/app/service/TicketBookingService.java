package com.infotech.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.app.dao.TicketBookingDao;
import com.infotech.app.entity.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		
		return ticketBookingDao.save(ticket);
	}

	public Ticket getTicketById(int ticketId) {
		
		return ticketBookingDao.findById(ticketId).orElse(null);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(int ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketData = ticketBookingDao.findById(ticketId).orElse(null);
		ticketData.setEmail(newEmail);
		Ticket updateTicket = ticketBookingDao.save(ticketData);
		return updateTicket;
	}

	
	
}
