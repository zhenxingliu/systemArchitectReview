/**
 * OctalObserver
 */
public class OctalObserver extends MyObserver {

    public OctalObserver(MySubject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }

}