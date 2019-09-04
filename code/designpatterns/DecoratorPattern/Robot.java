/**
 * Robot
 */
public class Robot  extends Changer{

    public Robot(Transform transform){
        super(transform);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("我可以说话");
    }
    
}