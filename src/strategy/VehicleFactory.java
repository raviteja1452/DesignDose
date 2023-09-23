package strategy;


public class VehicleFactory {

    public static Vehicle chooseVehicle(String vehicleName) {
        if(vehicleName.equalsIgnoreCase("BUS")) {
            return new Bus();
        } else if(vehicleName.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if(vehicleName.equalsIgnoreCase("BICYCLE")) {
            return new Bicycle();
        } else {
            System.out.println("Vehicle choosen is not available in the factory");
        }
        return null;
    }
}
