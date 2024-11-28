package src.command;

import src.rover.Rover;

public class TurnRightCommand implements Command{

	private final Rover rover;

	public TurnRightCommand(Rover rover) {
		this.rover = rover;
	}

	public void execute() {
		rover.turnRight();
	}

}
