package com.scaler.parkinglot.exceptions;

import com.scaler.parkinglot.models.ParkingSpotStatus;

public class ParkingSpotUnavailableException extends Exception{
    public ParkingSpotUnavailableException(String message) {
        super(message);
    }
}
