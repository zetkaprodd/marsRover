package src;

public class TurnLeftCommand implements Command{

	private Rover rover;

	public TurnLeftCommand(Rover rover) {
		this.rover = rover;
	}

	public void execute() {
		rover.turnLeft();
	}

}
