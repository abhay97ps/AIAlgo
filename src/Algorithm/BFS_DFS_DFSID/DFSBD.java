package Algorithm.BFS_DFS_DFSID;

import Model.State;

import java.util.ArrayList;
import java.util.Arrays;

public class DFSBD extends GenericSearch {

    @Override
    public ArrayList<State> pendMethod(ArrayList<State> open, ArrayList<State> neighbour) {
        neighbour.addAll(open);
        return neighbour;
    }

    @Override
    public boolean Test(State temp) {
        int[][] goal = {{1,2,3},{4,5,6},{7,8,0}};
        if(Arrays.deepEquals(goal,temp.matrix)) return true;
        else return false;
    }

}
