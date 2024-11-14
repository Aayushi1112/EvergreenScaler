package InterviewProblems;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int noOfIntervals=A.size();
        int curr_s=A.get(0).get(0);
        int curr_e=A.get(0).get(1);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<noOfIntervals;i++){
            System.out.println("inside loop on i="+i);
            if(A.get(i).get(0)<=curr_e){
                curr_s=Math.min(curr_s,A.get(i).get(0));
                curr_e=Math.max(curr_e,A.get(i).get(1));
            }
            else{
                ArrayList<Integer> ar=new ArrayList<Integer>();
                ar.add(curr_s);
                ar.add(curr_e);
                ans.add(ar);
                curr_s=A.get(i).get(0);
                curr_e=A.get(i).get(1);

            }
        }

        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(curr_s);
        ar.add(curr_e);
        ans.add(ar);

        return ans;
    }

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

        // Adding the arrays to the list of lists
        listOfLists.add(new ArrayList<>(List.of(1,5)));
        listOfLists.add(new ArrayList<>(List.of(4,6)));
        listOfLists.add(new ArrayList<>(List.of(7,20)));
        listOfLists.add(new ArrayList<>(List.of(15,30)));
        listOfLists.add(new ArrayList<>(List.of(31,34)));
        listOfLists.add(new ArrayList<>( List.of(50,50)));
        //listOfLists.add(new ArrayList<>(List.of(12, 14)));
        ArrayList<ArrayList<Integer>> answer=solve(listOfLists);
        System.out.println(answer);
    }
}
