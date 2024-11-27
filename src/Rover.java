package src;

public class Rover {
	
    private final Position position;
    
    private final Direction direction;

    public Rover() {
        this.position = new Position();
        this.direction = Direction.N;
    }

    public void moveForward(Position position, Direction direction) {
    	switch(direction) {
            case N: position.setY(position.y + 1 % 100); break;
            case S: position.setY(position.y - 1 % 100); break;
            case E: position.setX(position.x + 1 % 100); break;
            case W: position.setX(position.x - 1 % 100); break;
        }
    }

    public void moveBackward(Position position, Direction direction) {
    	switch(direction) {
            case N: position.setY(position.y - 1 % 100); break;
            case S: position.setY(position.y + 1 % 100); break;
            case E: position.setX(position.x - 1 % 100); break;
            case W: position.setX(position.x + 1 % 100); break;
        }
    }

    public void turnLeft(Direction direction) {
    	switch(direction) {
            case N: direction = Direction.W; break;
            case S: direction = Direction.E; break;
            case E: direction = Direction.N; break;
            case W: direction = Direction.S; break;
        }
    }

    public void turnRight(Direction direction) {
    	switch(direction) {
            case N: direction = Direction.E; break;
            case S: direction = Direction.W; break;
            case E: direction = Direction.S; break;
            case W: direction = Direction.N; break;
        }
    }
}
