package src;

public class Main {

    public static void main(String[] args) {
        Rover rover = new Rover();

        Command moveForward = new MoveForwardCommand(rover);
        Command moveBackward = new MoveBackwardCommand(rover);
        Command turnLeft = new TurnLeftCommand(rover);
        Command turnRight = new TurnRightCommand(rover);

        MissionController controller = new MissionController();

        controller.setCommand(moveForward);
        controller.executeCommand();

        controller.setCommand(turnRight);
        controller.executeCommand();

        controller.setCommand(moveForward);
        controller.executeCommand();

        controller.setCommand(turnLeft);
        controller.executeCommand();

        controller.setCommand(moveBackward);
        controller.executeCommand();
    }
}
