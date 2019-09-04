/**
 * Airplane
 */
public class Airplane  extends Changer{

    public Airplane(Transform transform){
        super(transform);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("我还可以在空中飞");
    }
    
}