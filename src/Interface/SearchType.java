package Interface;

import Model.State;

import java.util.ArrayList;
import java.util.HashSet;

public interface SearchType {
    ArrayList<State> pendMethod(ArrayList<State> open, ArrayList<State> neighbour);
    boolean Test(State state);
}
