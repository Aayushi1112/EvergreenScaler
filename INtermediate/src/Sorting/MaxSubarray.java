package Sorting;

import java.util.ArrayList;

public class MaxSubarray {
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int max=Integer.MIN_VALUE;
        for(int start=0;start<A;start++){
            int sum=0;
            for(int end=start;end<A;end++){
                sum=sum+C.get(end);
                if(sum<=B){
                    max=Math.max(sum,max);
                }
            }
        }

        return max;
    }
}
