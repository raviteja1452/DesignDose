package tollManagement.entities;

import tollManagement.enums.VehicleType;

public class TwoWheeler extends Vehicle {

    public TwoWheeler(final String registrationNo, final String ownerName, final VehicleType vehicleType) {
        super(registrationNo, ownerName, vehicleType);
    }
}
