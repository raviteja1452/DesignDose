package tollManagement.entities;

import tollManagement.enums.PassType;

public abstract class Pass {
    private Vehicle vehicle;
    private Toll toll;
    private TollBooth tollBooth;
    private PassType passType;
    public Pass(Vehicle vehicle, Toll toll, TollBooth booth, PassType passType) {
        this.vehicle = vehicle;
        this.toll = toll;
        this.tollBooth = booth;
        this.passType = passType;
    }
}
