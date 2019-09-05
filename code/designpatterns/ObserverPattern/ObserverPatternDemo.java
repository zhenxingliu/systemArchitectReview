/**
 * ObserverPatternDemo
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        MySubject subject = new MySubject();
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}