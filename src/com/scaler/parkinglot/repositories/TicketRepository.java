package com.scaler.parkinglot.repositories;

import com.scaler.parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private Map<Long,Ticket> tickets = new HashMap<>();
    private Long lastIdCount = 0L;

    // The input Ticket does not have an id, but the returned Ticket has a id
    public Ticket save (Ticket ticket)
    {
        ticket.setId(lastIdCount);
        tickets.put(lastIdCount, ticket);
        lastIdCount++;
        return ticket;
    }
}
