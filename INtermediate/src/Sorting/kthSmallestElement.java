package Sorting;

import java.util.ArrayList;
import java.util.List;

public class kthSmallestElement {
    public static int kthsmallest(final List<Integer> A, int B) {
        Integer[] array = new Integer[A.size()];
        array = A.toArray(array);
        int inx=0;
        int ele=0;
        if(A.size()==1){
            return A.get(0);
        }
        for(int i=0;i<B;i++){
            int minIndex=i;
            for(int j=i+1;j<A.size();j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            int temp= array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }
        return array[B-1];
    }

    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(47);
        arr.add(7);
        int ans=kthsmallest(arr,2);


    }
}
