package state;

public class CupFullState implements State{
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Take the cup");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Take the cup");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Coffee was taken");
        coffeeMachine.state = new NoCoinState();
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Too late!");
    }
}
