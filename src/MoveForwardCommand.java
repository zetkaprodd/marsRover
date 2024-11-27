package src;

public class MoveForwardCommand implements Command {

	private Rover rover;

	public MoveForwardCommand(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void execute() {
		rover.moveForward();
	}

}
