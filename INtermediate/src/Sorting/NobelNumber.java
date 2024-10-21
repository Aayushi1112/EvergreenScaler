package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NobelNumber {
    public static int solve(ArrayList<Integer> A) {
        if(A.get(0)==0){
            return 1;
        }
        int noLessThani=0;
        for(int i=1;i<A.size();i++){
            if(A.get(i)!=A.get(i-1)){
                noLessThani=i;

                if(i==A.get(i)){
                    return 1;
                }
            }

        }
        return -1;
    }

    public static void main(String args[]){
        Integer[] a={1,2,7,0,9,3,6,0,6};
        ArrayList<Integer> arr= (ArrayList<Integer>) Arrays.asList(a);
        int ans=solve(arr);
    }
}

