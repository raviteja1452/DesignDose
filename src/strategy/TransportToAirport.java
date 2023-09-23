package strategy;

public class TransportToAirport {
    private Vehicle vehicle;

   public void setVehicle(Vehicle vehicle) {
       this.vehicle = vehicle;
   }

   public void travelToDestination() {
       // This method will have logic of how to use vehicle's methods to
       // travel to destination.
       if(vehicle == null) {
           System.out.println("Please choose the strategy");
           return;
       }
       vehicle.moveForward();

       vehicle.moveRight();

       vehicle.moveLeft();
   }
}
