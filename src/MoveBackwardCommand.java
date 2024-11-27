package src;

public class MoveBackwardCommand implements Command{

	private Rover rover;

	public MoveBackwardCommand(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void execute() {
		rover.moveForward();
	}

}
