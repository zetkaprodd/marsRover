package src;

public class Position {
	int x;
	int y;
	
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
}
