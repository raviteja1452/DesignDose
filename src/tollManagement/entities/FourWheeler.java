package tollManagement.entities;

import tollManagement.enums.VehicleType;

public class FourWheeler extends Vehicle{
    public FourWheeler(final String registrationNo, final String ownerName, final VehicleType vehicleType) {
        super(registrationNo, ownerName, vehicleType);
    }
}
