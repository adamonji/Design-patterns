package strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int[] numbers)  {
        strategy.sort(numbers);
    }

}
