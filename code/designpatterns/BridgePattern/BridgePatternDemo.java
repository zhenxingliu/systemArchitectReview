/**
 * BridgePatternDemo
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Road road = new CementRoad(new Car());
        road.driveOnRoad();
    }
}