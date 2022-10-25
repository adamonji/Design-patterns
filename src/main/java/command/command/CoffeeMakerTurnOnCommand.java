package command.command;

import command.CoffeeMaker;

public class CoffeeMakerTurnOnCommand implements Command{
    private CoffeeMaker coffeMaker;

    public CoffeeMakerTurnOnCommand(CoffeeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void undo() {
        coffeMaker.turnOff();
    }

    @Override
    public void execute() {
        coffeMaker.turnOn();
    }
}
