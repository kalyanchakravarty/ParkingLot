package com.scaler.parkinglot.dtos;

import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.Vehicle;

public class CreateTicketRequestDto {
    private Gate gate;
    private Vehicle vehicle;

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
