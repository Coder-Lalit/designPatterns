package behavioralDesignPattern.strategyPattern;

public class OperationManager {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void execute(int a, int b){
        this.strategy.execute(a,b);
    }
}
