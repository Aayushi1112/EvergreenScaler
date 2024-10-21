package Matrices;

import java.util.ArrayList;
import java.util.List;

public class SumOfPrincipalDiagonal {
    public int solve(final List<ArrayList<Integer>> A) {
        int rows=A.size();
        int sum=0;
        for(int i=0;i<rows;i++){

            sum=sum+A.get(i).get(i);

        }
        return sum;
    }
}
