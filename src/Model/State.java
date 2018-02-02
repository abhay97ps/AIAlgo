package Model;


import java.util.Arrays;

public class State {
    //define state accordingly
    public State parent =null;
    public int depth = 0;
    public int[][] matrix;

    public State(State parent, int depth, int[][] matrix) {
        this.parent = parent;
        this.depth = depth;
        this.matrix = matrix;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof State && Arrays.deepEquals(matrix,((State)o).matrix));
    }

    public void printMatrix() {
        String a = matrix[0][0] + "," + matrix[0][1] + "," + matrix[0][2];
        String b = matrix[1][0] + "," + matrix[1][1] + "," + matrix[1][2];
        String c = matrix[2][0] + "," + matrix[2][1] + "," + matrix[2][2];
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
