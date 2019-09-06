/**
 * StatePatternDemo
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        ElevatorContext context = new ElevatorContext();
        context.setBaseState(new ClosingState());
        context.run().open().close();

        ElevatorContext context1 = new ElevatorContext();
        context1.setBaseState(new RunningState());
        context1.stop().open().run().open();
    }
}