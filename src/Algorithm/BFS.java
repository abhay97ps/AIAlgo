package Algorithm;

import Model.State;

import java.util.ArrayList;
import java.util.Arrays;

public class BFS extends GenericSearch {
    int Max_depth = 0;
    State state;

    public BFS(State state) {
        Max_depth = 1000000;
        this.state = state;
        Search(state,Max_depth);
    }

    @Override
    public ArrayList<State> pendMethod(ArrayList<State> open, ArrayList<State> neighbour) {
        open.addAll(neighbour);
        return open;
    }

    @Override
    public boolean Test(State temp) {
        int[][] goal = {{1,2,3},{4,5,6},{7,8,0}};
        if(Arrays.deepEquals(goal,temp.matrix)) return true;
        else return false;
    }


}
