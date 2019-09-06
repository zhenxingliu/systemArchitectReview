/**
 * StrategyContext
 */
public class OperationStrategyContext {

    private OperationStrategy strategy;

   public OperationStrategyContext(OperationStrategy strategy){
      this.strategy = strategy;
   }

   /**
    * @param strategy the strategy to set
    */
   public void setStrategy(OperationStrategy strategy) {
       this.strategy = strategy;
   }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}