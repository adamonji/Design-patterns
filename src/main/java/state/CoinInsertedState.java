package state;

public class CoinInsertedState implements State{
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("The coin has been thrown in");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Coffee is making");
        coffeeMachine.state = new CupFullState();
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Push the button");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Returned the coin");
        coffeeMachine.state = new NoCoinState();
    }
}
