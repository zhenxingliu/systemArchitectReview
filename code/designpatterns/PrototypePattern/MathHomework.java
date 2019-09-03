/**
 * MathHomework
 */
public class MathHomework extends Homework {


    private Date A = new Date();

    private int a = 1;

    @Override
    public void show() {
        System.out.println("Math clone");
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    /**
     * @return the a
     */
    public Date getA() {
        return A;
    }

}