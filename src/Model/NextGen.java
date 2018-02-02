package Model;

import java.util.ArrayList;

public class NextGen {

    public ArrayList<State> Next(State state){
        //Next state generation
        ArrayList<State> Neighbour = new ArrayList<State>();
        int i=0,j=0;
        label:for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(state.matrix[i][j] == 0) break label;
            }
        }
        if(left(i,j,state)!=null){
            Neighbour.add(left(i,j,state));
        }
        if(right(i,j,state)!=null){
            Neighbour.add(right(i,j,state));
        }
        if(up(i,j,state)!=null){
            Neighbour.add(up(i,j,state));
        }
        if(down(i,j,state)!=null){
            Neighbour.add(down(i,j,state));
        }
        return Neighbour;
    }

    private State left(int x,int y,State state){
        if(y-1>=0){
            int temp[][] = new int[3][3];
            for(int a = 0;a<3; a++){
                for(int b=0; b<3; b++){
                    temp[a][b] = state.matrix.clone()[a][b];
                }
            }
            temp[x][y]=temp[x][y-1];
            temp[x][y-1] = 0;
            State newst = new State(state,state.depth+1,temp);
            return newst;
        }
        else return null;
    }
    private State right(int x,int y,State state){
        if(y+1<3){
            int temp[][] = new int[3][3];
            for(int a = 0;a<3; a++){
                for(int b=0; b<3; b++){
                    temp[a][b] = state.matrix.clone()[a][b];
                }
            }
            temp[x][y]=temp[x][y+1];
            temp[x][y+1] = 0;
            State newst = new State(state,state.depth+1,temp);
            return newst;
        }
        else return null;
    }
    private State up(int x,int y,State state){
        if(x-1>=0){
            int temp[][] = new int[3][3];
            for(int a = 0;a<3; a++){
                for(int b=0; b<3; b++){
                    temp[a][b] = state.matrix.clone()[a][b];
                }
            }
            temp[x][y]=temp[x-1][y];
            temp[x-1][y] = 0;
            State newst = new State(state,state.depth+1,temp);
            return newst;
        }
        else return null;
    }
    private State down(int x,int y,State state){
        if(x+1<3){
            int temp[][] = new int[3][3];
            for(int a = 0;a<3; a++){
                for(int b=0; b<3; b++){
                    temp[a][b] = state.matrix.clone()[a][b];
                }
            }
            temp[x][y]=temp[x+1][y];
            temp[x+1][y] = 0;
            State newst = new State(state,state.depth+1,temp);
            return newst;
        }
        else return null;
    }
}
