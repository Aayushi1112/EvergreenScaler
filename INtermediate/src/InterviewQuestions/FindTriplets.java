package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTriplets {
    public static int solve(ArrayList<Integer> A)
    {
        int count=0;

        for(int i=0;i<A.size();i++){
            int l=0;
            int r=0;

            for(int j=i-1;j>=0;j--){
                if(A.get(j)<A.get(i)){
                    l++;
                }
            }
            for(int j=i+1;j<A.size();j++){
                if(A.get(j)>A.get(i)){
                    r++;
                }

            }
            count=count+(l*r);
        }
        return count;
    }


    public static void main(String args[]){
        List<Integer> list = Arrays.asList(17, 23, 30, 19, 8, 17, 17);
        ArrayList<Integer> ar = new ArrayList<>(list);

        int count=solve(ar);
        System.out.println(count);

    }

}
