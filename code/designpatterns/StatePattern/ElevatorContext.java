/**
 * ElevatorContext
 */
public class ElevatorContext {

    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final FaultState FAULT_STATE = new FaultState();
    public static final OpeningState OPENING_STATE = new OpeningState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StoppingState STOPPING_STATE = new StoppingState();

    private BaseState mBaseState;

    public BaseState getBaseState() {
        return mBaseState;
    }

    public void setBaseState(BaseState baseState) {
        this.mBaseState = baseState;
        this.mBaseState.setContext(this);
    }

    /**
     * 模拟电梯的运行方法
     */
    public ElevatorContext run() {
        this.mBaseState.run();
        return this;
    }

    /**
     * 模拟电梯的停止方法
     */
    public ElevatorContext stop() {
        this.mBaseState.stop();
        return this;
    }

    /**
     * 模拟电梯的开门方法
     */
    public ElevatorContext open() {
        this.mBaseState.open();
        return this;
    }

    /**
     * 模拟电梯的关门方法
     */
    public ElevatorContext close() {
        this.mBaseState.close();
        return this;
    }
}