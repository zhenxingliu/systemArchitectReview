/**
 * DecoratorPatternDemo
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Transform robotAirplaneCar = new Airplane(new Robot(new Car1()));
        robotAirplaneCar.move();
    }
}