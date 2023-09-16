package tollManagement.entities;

import tollManagement.enums.VehicleType;

public abstract class Vehicle {
    private String registrationNo;
    private String ownerName;
    private VehicleType vehicleType;


    public Vehicle(String registrationNo, String ownerName, VehicleType vehicleType) {
        this.registrationNo = registrationNo;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

}
