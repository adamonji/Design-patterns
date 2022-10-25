package command.command;

import command.Robot;

public class RobotTurnOnCommand implements Command {
    @Override
    public void undo()  {
        robot.turnOff();
    }

    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOn();
    }
}
