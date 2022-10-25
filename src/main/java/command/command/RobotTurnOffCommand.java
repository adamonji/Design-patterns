package command.command;

import command.Robot;

public class RobotTurnOffCommand implements Command{

    private Robot robot;

    @Override
    public void undo() {
        robot.turnOn();
    }

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOff();
    }
}
