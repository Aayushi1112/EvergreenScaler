package Recursion;

import java.util.ArrayList;

public class PrintIndicesELementB {
    public ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr=getIndices(A,B,A.size()-1,arr);
        return arr;
    }
    public ArrayList<Integer> getIndices(ArrayList<Integer> arr,int ele,int end,ArrayList<Integer> arrResult){
        if(end==-1)
            return arrResult;

        getIndices(arr,ele,end-1,arrResult);
        if(arr.get(end)==ele){
            arrResult.add(end);

        }
        return arrResult;
    }
}
