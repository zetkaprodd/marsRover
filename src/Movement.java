package src;

public class Movement {

    public  forward(Direction direction, int x, int y) {
    		
    	
    	}
    }

    public void backward(Direction direction, int x, int y) {

    }

    public Direction left(Direction direction) {
    	switch(direction) {
			case N:
				direction = Direction.W;
				break;
			case W:
				direction = Direction.S;
				break;
			case S:
				direction = Direction.E;
				break;
			case E:
				direction = Direction.N;
				break;
			case default:
				break;
    	}
    	return direction;
    }

    public Direction right(Direction direction) {
    	switch(direction) {
		case N:
			direction = Direction.E;
			break;
		case E:
			direction = Direction.S;
			break;
		case S:
			direction = Direction.W;
			break;
		case W:
			direction = Direction.N;
			break;
		case default:
			break;
    	}
    	return direction;
    }
}
