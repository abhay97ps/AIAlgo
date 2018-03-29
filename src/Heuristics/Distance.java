package Heuristics;

import Model.State;

public class Distance {
    public int Man_Dis(State state){
        int sum = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int num = state.matrix[i][j];
                if(num==0) continue;
                int q = num/3;
                int r = num%3;
                if(r==0){
                    q=q-1;
                    r=2;
                }
                else{
                    r=r-1;
                }
                sum+=(Math.abs(q-i)+Math.abs(r-j));
            }
        }
        return sum;
    }
}
