package tollManagement.entities;

import tollManagement.enums.PassType;

public class OneDayPass extends Pass{
    public OneDayPass(final Vehicle vehicle, final Toll toll, final TollBooth booth, final PassType passType) {
        super(vehicle, toll, booth, passType);
    }

    void testAbc(Vehicle vehicle) {

    }
}
