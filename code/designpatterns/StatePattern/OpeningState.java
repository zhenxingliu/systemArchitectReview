/**
 * @author HaoTianYi hao.ty@haotianyi.win
 * @version v1.0 模拟电梯打开状态
 */
public class OpeningState extends BaseState {
    /**
     * 模拟电梯的运行方法
     */
    @Override
    public void run() {
        super.mContext.setBaseState(ElevatorContext.FAULT_STATE);
    }

    /**
     * 模拟电梯的停止方法
     */
    @Override
    public void stop() {

    }

    /**
     * 模拟电梯的开门方法
     */
    @Override
    public void open() {
        System.out.println("电梯开门-----------");
    }

    /**
     * 模拟电梯的关门方法
     */
    @Override
    public void close() {
        super.mContext.setBaseState(ElevatorContext.CLOSING_STATE);
        System.out.println("电梯关门-----------");
    }
}