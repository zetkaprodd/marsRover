package src;

import src.Direction;

public class Rover {
	
    private final Position position;
    
    private Direction direction;

    public Rover() {
        this.position = new Position();
        this.direction = Direction.N;
    }

    public void moveForward() {
    	switch(direction) {
            case N: position.setY(position.y + 1 % 100); break;
            case S: position.setY(position.y - 1 % 100); break;
            case E: position.setX(position.x + 1 % 100); break;
            case W: position.setX(position.x - 1 % 100); break;
        }
        System.out.println("Rover position has changed. New position: " + position.toString());
    }

    public void moveBackward() {
    	switch(direction) {
            case N: position.setY(position.y - 1 % 100); break;
            case S: position.setY(position.y + 1 % 100); break;
            case E: position.setX(position.x - 1 % 100); break;
            case W: position.setX(position.x + 1 % 100); break;
        }
        System.out.println("Rover position has changed. New position: " + position.toString());
    }

    public void turnLeft() {
    	switch(direction) {
            case N: direction = Direction.W; break;
            case S: direction = Direction.E; break;
            case E: direction = Direction.N; break;
            case W: direction = Direction.S; break;
        }
        System.out.println("Rover direction has changed. New direction: " + direction);
    }

    public void turnRight() {
    	switch(direction) {
            case N: direction = Direction.E; break;
            case S: direction = Direction.W; break;
            case E: direction = Direction.S; break;
            case W: direction = Direction.N; break;
        }
        System.out.println("Rover direction has changed. New direction: " + direction);
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
