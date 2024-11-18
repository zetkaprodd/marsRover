package src;

public class Grid {

    public int[][] array;

    public Grid(int rows, int cols, int[][] obstacles) {

        this.array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k =0; k < obstacles.length; k++)
                    if (i == obstacles[k][0] && j == obstacles[k][1]){
                        array[i][j] = 1;
                    }else {
                        array[i][j] = 0;
                    }
            }
        }
    }
}
