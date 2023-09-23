package strategy;

public class Main {
    public static void main(String[] args) {

        // 1st day.
        Vehicle vehicle = VehicleFactory.chooseVehicle("CAR");
        TransportToAirport transportToAirport = new TransportToAirport();
        transportToAirport.setVehicle(vehicle);
        transportToAirport.travelToDestination();

        // 2nd day.
        Vehicle vehicle2 = VehicleFactory.chooseVehicle("BUS");
        transportToAirport.setVehicle(vehicle2);
        transportToAirport.travelToDestination();
    }
}
