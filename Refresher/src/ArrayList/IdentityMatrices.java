package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class IdentityMatrices {
    public static int solve(final List<ArrayList<Integer>> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (A.get(i).get(j) != 1) {
                        return 0;
                    }
                } else {
                    if (A.get(i).get(j) != 0) {
                        return 0;
                    }
                }
            }

        }
        return 1;
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> bigArr=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> smallArr1=new ArrayList<Integer>();
        ArrayList<Integer> smallArr2=new ArrayList<Integer>();
        smallArr1.add(1);
        smallArr1.add(0);
        smallArr2.add(0);
        smallArr2.add(1);

        bigArr.add(smallArr1);
        bigArr.add(smallArr2);
        int result=solve(bigArr);
        System.out.print(result);

    }
}



