package test.java;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import src.rover.Direction;
import src.rover.Position;
import src.rover.Rover;

public class RoverTest {

    @Test
    public void testInitialPositionAndDirection() {
        Rover rover = new Rover();
        assertEquals(new Position(0, 0), rover.getPosition(), "Initial position should be (0,0)");
        assertEquals(Direction.N, rover.getDirection(), "Initial direction should be North");
    }

    @Test
    public void testMoveForwardWithoutObstacle() {
        Rover rover = new Rover();
        rover.moveForward();
        assertEquals(new Position(0, 1), rover.getPosition(), "Rover should move forward to (0,1)");
        assertEquals(Direction.N, rover.getDirection(), "Direction should remain North");
    }

    @Test
    public void testMoveBackwardWithoutObstacle() {
        Rover rover = new Rover();
        rover.moveBackward();
        assertEquals(new Position(0, 9), rover.getPosition(), "Rover should wrap around and move to (0,9)");
        assertEquals(Direction.N, rover.getDirection(), "Direction should remain North");
    }

    @Test
    public void testTurnLeft() {
        Rover rover = new Rover();
        rover.turnLeft();
        assertEquals(Direction.W, rover.getDirection(), "Rover should turn left to face West");
    }

    @Test
    public void testTurnRight() {
        Rover rover = new Rover();
        rover.turnRight();
        assertEquals(Direction.E, rover.getDirection(), "Rover should turn right to face East");
    }

    @Test
    public void testObstacleDetectionOnMoveForward() {
        Rover rover = new Rover();
        rover.turnRight(); // Face East
        rover.moveForward(); // Move to (1,0)
        rover.moveForward(); // Move to (2,0)
        rover.turnLeft(); // Face North
        rover.moveForward(); // Move to (2,1)
        rover.moveForward(); // Move to (2,2)
        rover.moveForward(); // Move to (2,3)
        rover.moveForward(); // Move to (2,4)
        rover.moveForward(); // Move to (2,5), encounter obstacle
        rover.moveForward(); // Should not move due to obstacle
        assertEquals(new Position(2, 5), rover.getPosition(), "Rover should not move when an obstacle is detected");
    }

    @Test
    public void testObstacleDetectionOnMoveBackward() {
        Rover rover = new Rover();
        rover.turnRight(); // Face East
        rover.moveForward(); // Move to (1,0)
        rover.moveForward(); // Move to (2,0)
        rover.turnLeft(); // Face North
        rover.moveForward(); // Move to (2,1)
        rover.turnRight(); // Face East
        rover.moveBackward(); // Encounter obstacle at (1,1)
        assertEquals(new Position(2, 1), rover.getPosition(), "Rover should not move backward when an obstacle is detected");
    }

    @Test
    public void testWrapAroundWhenMovingOutOfBounds() {
        Rover rover = new Rover();
        rover.turnLeft(); // Face West
        rover.moveForward(); // Wrap to (9,0)
        assertEquals(new Position(9, 0), rover.getPosition(), "Rover should wrap around to (9,0) when moving west from (0,0)");
    }

    @Test
    public void testMoveSequenceWithWrapAroundAndObstacles() {
        Rover rover = new Rover();
        rover.turnRight(); // Face East
        rover.moveForward(); // Move to (1,0)
        rover.moveForward(); // Move to (2,0)
        rover.moveBackward(); // Move back to (1,0)
        rover.moveBackward(); // Wrap to (0,0)
        assertEquals(new Position(0, 0), rover.getPosition(), "Rover should follow the move sequence correctly");
    }
}
