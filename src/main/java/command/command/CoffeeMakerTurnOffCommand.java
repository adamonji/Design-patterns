package command.command;

import command.CoffeeMaker;

public class CoffeeMakerTurnOffCommand implements Command{

    private CoffeeMaker coffeMaker;

    public CoffeeMakerTurnOffCommand(CoffeeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void undo() {
        coffeMaker.turnOn();
    }

    @Override
    public void execute() {
        coffeMaker.turnOff();
    }
}
