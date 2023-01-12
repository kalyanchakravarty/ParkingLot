package com.scaler.parkinglot.strategies.spotassignment;

import com.scaler.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.scaler.parkinglot.models.ParkingLot;
import com.scaler.parkinglot.models.ParkingSpot;
import com.scaler.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType type) throws ParkingSpotUnavailableException;
}
