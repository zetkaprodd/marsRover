package src.rover;

import java.util.*;

public class Rover {
	
    private Position position;
    private Direction direction;
    private static final int GRID_SIZE = 10;
    private final ArrayList<Position> obstacles = new ArrayList<>();


    public Rover() {
        this.position = new Position();
        this.direction = Direction.N;
        obstacles.add(new Position(5,5));
        obstacles.add(new Position(6,8));
        obstacles.add(new Position(1,1));
        obstacles.add(new Position(2,6));
    }

    private boolean hasObstacle(Position position) {
        return obstacles.contains(position);
    }

    public void moveForward() {
        Position newPosition = new Position(position.getX(), position.getY());
        switch (direction) {
            case N: newPosition.setY(newPosition.y + 1); break;
            case E: newPosition.setX(newPosition.x + 1); break;
            case S: newPosition.setY(newPosition.y - 1); break;
            case W: newPosition.setX(newPosition.x - 1); break;
        }
        newPosition.wrapAround();
        if (hasObstacle(newPosition)) {
            System.out.println("Obstacle détecté à la position: " + newPosition + ". Déplacement annulé.");
        } else {
            position = newPosition;
            System.out.println("Rover avancé à la position: " + position + " Direction: " + direction);
        }
    }

    public void moveBackward() {
        Position newPosition = new Position(position.getX(), position.getY());
        switch (direction) {
            case N: newPosition.setY(newPosition.y - 1); break;
            case E: newPosition.setX(newPosition.x - 1); break;
            case S: newPosition.setY(newPosition.y + 1); break;
            case W: newPosition.setX(newPosition.x + 1); break;
        }
        newPosition.wrapAround();
        if (hasObstacle(newPosition)) {
            System.out.println("Obstacle détecté à la position: " + newPosition + ". Déplacement annulé.");
        } else {
            position = newPosition;
            System.out.println("Rover reculé à la position: " + position + " Direction: " + direction);
        }
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
