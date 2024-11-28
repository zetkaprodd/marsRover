package src;

public class Position {
	int x;
	int y;
	public static final int GRID_SIZE = 10;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Position() {
		this(0,0);
	}
	
	public void setX(int x) {
		this.x =x;
	}
	
	public void setY(int y) {
		this.y =y;
	}

	public void wrapAround() {
		this.x = (this.x + GRID_SIZE) % GRID_SIZE;
		this.y = (this.y + GRID_SIZE) % GRID_SIZE;
	}


	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Position other = (Position) obj;
		if (x != other.x) {
			return false;
		}
        return y == other.y;
    }

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
