package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumCostDeletion {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A,Collections.reverseOrder());
        int cost=0;
        for(int i=0;i<A.size();i++){
            cost=cost+A.get(i)*(i+1);
        }

        return cost;
    }
}
