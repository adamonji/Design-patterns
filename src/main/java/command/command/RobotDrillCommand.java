package command.command;

import command.Robot;

public class RobotDrillCommand implements Command{

    private Robot robot;

    @Override
    public void undo() {

    }

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.drill();
    }
}
