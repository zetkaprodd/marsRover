package src.command;

import src.rover.Rover;

public class MoveForwardCommand implements Command {

	private final Rover rover;

	public MoveForwardCommand(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void execute() {
		rover.moveForward();
	}

}
