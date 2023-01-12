package com.scaler.parkinglot.strategies.spotassignment;

import com.scaler.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.scaler.parkinglot.models.*;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType type) throws ParkingSpotUnavailableException {
        for(ParkingFloor floor : parkingLot.getFloors())
        {
            for (ParkingSpot spot : floor.getParkingSpots())
            {
                if ((spot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE))
                    && (spot.getSupportedVehicles().contains(type)))
                {
                    return spot;
                }
            }
        }
        throw new ParkingSpotUnavailableException("No parking spot was available");
    }
}
