public abstract class Changer implements Transform {

    protected Transform transform;

    public Changer(Transform  transform){
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }

}