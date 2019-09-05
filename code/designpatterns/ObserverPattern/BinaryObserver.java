/**
 * BinaryObserver
 */
public class BinaryObserver extends MyObserver {

    public BinaryObserver(MySubject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }

}