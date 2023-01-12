package com.scaler.parkinglot.models;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private List<VehicleType> supportedVehicles;
    private Vehicle currentVehicle;
    private String name;
    private ParkingSpotStatus parkingSpotStatus;

    public List<VehicleType> getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(List<VehicleType> supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public void setCurrentVehicle(Vehicle currentVehicle) {
        this.currentVehicle = currentVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}
