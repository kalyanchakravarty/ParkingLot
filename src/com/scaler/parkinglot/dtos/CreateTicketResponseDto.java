package com.scaler.parkinglot.dtos;

import com.scaler.parkinglot.models.Ticket;

public class CreateTicketResponseDto {
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Ticket ticket;
    private String message;
}
