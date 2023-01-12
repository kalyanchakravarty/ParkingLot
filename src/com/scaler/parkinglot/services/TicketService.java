package com.scaler.parkinglot.services;

import com.scaler.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.scaler.parkinglot.models.*;
import com.scaler.parkinglot.repositories.ParkingLotRepository;
import com.scaler.parkinglot.repositories.ParkingSpotRepository;
import com.scaler.parkinglot.repositories.TicketRepository;
import com.scaler.parkinglot.strategies.spotassignment.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {

    private SpotAssignmentStrategy spotAssignmentStrategy;
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;


    public TicketService(SpotAssignmentStrategy spotAssignmentStrategy, TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Ticket createTicket(Vehicle vehicle, Gate gate) throws ParkingSpotUnavailableException
    {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setGate(gate);
        ticket.setVehicle(vehicle);

        //parking assignment strategy
        //get parking lot for gate id
        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(parkingLotRepository.getParkingLotForGate(gate), vehicle.getVehicleType());
        //assign the parking spot got from strategy
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        parkingSpotRepository.save(parkingSpot);
        ticket.setParkingSpot(parkingSpot);

        return ticketRepository.save(ticket);
    }
}
