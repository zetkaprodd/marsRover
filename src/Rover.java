package src;

public class Rover {
	
    private Position position;
    
    private Direction direction;

    public Rover(Direction direction) {
        this.position = new Position();
        this.direction = direction;
    }

    public void moveForward(Position position, Direction direction) {
    	switch(direction) {
    		case N:
    			position.setY(position.y+1);
    	}
    }



}
