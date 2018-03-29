package TestCode;

import Algorithm.BFS_DFS_DFSID.DFSID;
import Heuristics.Distance;
import Model.State;

public class Main {
    public static void main(String[] args) {

        int[][] mat = {{1,2,3},{4,8,0},{7,6,5}};
        State start = new State(null,0,mat);

        //DFS dfs = new DFS(start);

        //BFS bfs = new BFS(start);

        //DFSID dfsid = new DFSID(start);

        Distance d = new Distance();
        int x = d.Man_Dis(start);
        System.out.println(x);

    }
}
