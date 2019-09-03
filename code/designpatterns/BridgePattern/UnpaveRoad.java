/**
 * UnpaveRoad
 */
public class UnpaveRoad extends Road{


    public UnpaveRoad(Vehicle vehicle){
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        super.vehicle.drive();
        System.out.println("行驶在石子路");
    }
    
}