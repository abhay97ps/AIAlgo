package Algorithm.BFS_DFS_DFSID;

import Model.State;

public class DFSID {
    int Max_depth = 0;
    boolean flag = true;
    State state;

    public DFSID(State state) {
        this.state = state;
        Search();
    }

    public void Search(){
        while(flag){
            DFSBD dfsbd = new DFSBD();
            flag = dfsbd.Search(state,Max_depth);
            Max_depth += 1;
        }
    }
}
