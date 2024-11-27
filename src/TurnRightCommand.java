package src;

public class TurnRightCommand implements Command{

	private Rover rover;

	public TurnRightCommand(Rover rover) {
		this.rover = rover;
	}

	public void execute() {
		rover.turnRight();
	}

}
