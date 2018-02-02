package Algorithm;

import Interface.SearchType;
import Model.NextGen;
import Model.State;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public abstract class GenericSearch implements SearchType{
    ArrayList<State> Open = new ArrayList<State>();
    ArrayList<State> Closed = new ArrayList<State>();
    boolean Flag = true;
    public boolean Search(State start,int Max_depth) {
        Open.add(start);
        while(!Open.isEmpty()){
            State temp = Open.iterator().next();
            Closed.add(temp);
            Open.remove(temp);
            if(temp.depth > Max_depth) continue;
            if(Test(temp)) {
                SolStackTrace(temp);
                return false;
            }
            ArrayList<State> Neighbour = new ArrayList<State>(new NextGen().Next(temp));
            if (Neighbour.isEmpty() && temp.depth==Max_depth) Flag=false;
            else Flag = true;
            Neighbour.removeAll(Open);
            Neighbour.removeAll(Closed);
            Open = pendMethod(Open,Neighbour);
        }
        return Flag;
    }

    protected void SolStackTrace(State state) {
        ArrayList<State> states = new ArrayList<>();
        while (state!=null){
            states.add(state);
            state = state.parent;
        }
        Collections.reverse(states);
        Iterator<State> iterator = states.iterator();
        while (iterator.hasNext()){
            iterator.next().printMatrix();
            System.out.println(".....");
        }
    }
}
