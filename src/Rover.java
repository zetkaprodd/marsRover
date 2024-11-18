package src;

public class Rover {

    private int x;
    private  int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction ) {
        this.y = y;
        this.x = x;
        this.direction = direction;
    }

    public void move(String input){
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch(c){
                case 'f':
                    new Movement().forward(this.direction, this.x, this.y);
                case 'b':
                    new Movement().backward(this.direction, this.x, this.y);
                case 'l':
                    new Movement().left(this.direction);
                case 'r':
                    new Movement().right(this.direction);
            }
        }
    }



}
