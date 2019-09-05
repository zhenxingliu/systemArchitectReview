/**
 * MySubject
 */

import java.util.*;

public class MySubject {

    private List<MyObserver> observers = new ArrayList<MyObserver>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(MyObserver observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (MyObserver observer : observers) {
            observer.update();
        }
    }
}