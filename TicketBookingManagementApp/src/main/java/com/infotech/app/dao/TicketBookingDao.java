package com.infotech.app.dao;

import org.springframework.data.repository.CrudRepository;
import com.infotech.app.entity.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

}
